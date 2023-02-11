package com.package_name.csv_to_database;

import java.math.BigInteger;
import java.util.Date;
import java.util.UUID;

public final class Record {

    private String id;
    private BigInteger abn;
    private String name;
    private String otherName;
    private String addressType;
    private String addressLine1;
    private String addressLine2;
    private String addressLine3;
    private String townCity;
    private String state;
    private String postcode;
    private String country;
    private String websiteUrl;
    private Date registrationDate;
    private Date establishedDate;
    private String charitySize;
    private int numberOfResponsiblePersons;
    private String financialYearEnd;
    private boolean operates_in_act;
    private boolean operates_in_nsw;
    private boolean operates_in_nt;
    private boolean operates_in_qld;
    private boolean operates_in_sa;
    private boolean operates_in_tas;
    private boolean operates_in_vic;
    private boolean operates_in_wa;
    private String operatingCountries;
    private boolean pbi;
    private boolean hpc;
    private boolean animals;
    private boolean culture;
    private boolean education;
    private boolean health;
    private boolean law;
    private boolean naturalEnvironment;
    private boolean human_rights;
    private boolean generalPublic;
    private boolean reconciliation;
    private boolean religion;
    private boolean publicWelfare;
    private boolean security;
    private boolean aboriginal_or_torres_strait_islanders;
    private boolean adults;
    private boolean elderly;
    private boolean children;
    private boolean overseas;
    private boolean earlyChildhood;
    private boolean ethnicGroups;
    private boolean families;
    private boolean females;
    private boolean financial;
    private boolean lgbtPlus;
    private boolean generalCommunity;
    private boolean males;
    private boolean migrants;
    private boolean otherBeneficiaries;
    private boolean otherCharities;
    private boolean homelessness;
    private boolean chronic_illness;
    private boolean disabilities;
    private boolean prePostReleaseOffenders;
    private boolean rural;
    private boolean unemployed;
    private boolean veterans;
    private boolean victims_of_crime;
    private boolean victims_of_disaster;
    private boolean youth;

    public Record(String abn, String name, String otherName, String addressType, String addressLine1, String addressLine2, String addressLine3, String townCity, String state, String postcode, String country, String websiteUrl, Date registrationDate, Date establishedDate, String charitySize, String numberOfResponsiblePersons, String financialYearEnd, String operates_in_act, String operates_in_nsw, String operates_in_nt, String operates_in_qld, String operates_in_sa, String operates_in_tas, String operates_in_vic, String operates_in_wa, String operatingCountries, String pbi, String hpc, String animals, String culture, String education, String health, String law, String naturalEnvironment, String human_rights, String generalPublic, String reconciliation, String religion, String publicWelfare, String security, String aboriginal_or_torres_strait_islanders, String adults, String elderly, String children, String overseas, String earlyChildhood, String ethnicGroups, String families, String females, String financial, String lgbtPlus, String generalCommunity, String males, String migrants, String otherBeneficiaries, String otherCharities, String homelessness, String chronic_illness, String disabilities, String prePostReleaseOffenders, String rural, String unemployed, String veterans, String victims_of_crime, String victims_of_disaster, String youth) {
        this.id = UUID.randomUUID().toString();
        this.abn = new BigInteger(abn);
        this.name = name;
        this.otherName = otherName;
        this.addressType = addressType;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.addressLine3 = addressLine3;
        this.townCity = townCity;
        this.state = state;
        this.postcode = postcode;
        this.country = country;
        this.websiteUrl = websiteUrl;
        this.registrationDate = registrationDate;
        this.establishedDate = establishedDate;
        this.charitySize = charitySize;
        this.numberOfResponsiblePersons = Integer.parseInt(numberOfResponsiblePersons);
        this.financialYearEnd = financialYearEnd;
        this.operates_in_act = operates_in_act.equalsIgnoreCase("y");
        this.operates_in_nsw = operates_in_nsw.equalsIgnoreCase("y");
        this.operates_in_nt = operates_in_nt.equalsIgnoreCase("y");
        this.operates_in_qld = operates_in_qld.equalsIgnoreCase("y");
        this.operates_in_sa = operates_in_sa.equalsIgnoreCase("y");
        this.operates_in_tas = operates_in_tas.equalsIgnoreCase("y");
        this.operates_in_vic = operates_in_vic.equalsIgnoreCase("y");
        this.operates_in_wa = operates_in_wa.equalsIgnoreCase("y");
        this.operatingCountries = operatingCountries;
        this.pbi = pbi.equalsIgnoreCase("y");
        this.hpc = hpc.equalsIgnoreCase("y");
        this.animals = animals.equalsIgnoreCase("y");
        this.culture = culture.equalsIgnoreCase("y");
        this.education = education.equalsIgnoreCase("y");
        this.health = health.equalsIgnoreCase("y");
        this.law = law.equalsIgnoreCase("y");
        this.naturalEnvironment = naturalEnvironment.equalsIgnoreCase("y");
        this.human_rights = human_rights.equalsIgnoreCase("y");
        this.generalPublic = generalPublic.equalsIgnoreCase("y");
        this.reconciliation = reconciliation.equalsIgnoreCase("y");
        this.religion = religion.equalsIgnoreCase("y");
        this.publicWelfare = publicWelfare.equalsIgnoreCase("y");
        this.security = security.equalsIgnoreCase("y");
        this.aboriginal_or_torres_strait_islanders = aboriginal_or_torres_strait_islanders.equalsIgnoreCase("y");
        this.adults = adults.equalsIgnoreCase("y");
        this.elderly = elderly.equalsIgnoreCase("y");
        this.children = children.equalsIgnoreCase("y");
        this.overseas = overseas.equalsIgnoreCase("y");
        this.earlyChildhood = earlyChildhood.equalsIgnoreCase("y");
        this.ethnicGroups = ethnicGroups.equalsIgnoreCase("y");
        this.families = families.equalsIgnoreCase("y");
        this.females = females.equalsIgnoreCase("y");
        this.financial = financial.equalsIgnoreCase("y");
        this.lgbtPlus = lgbtPlus.equalsIgnoreCase("y");
        this.generalCommunity = generalCommunity.equalsIgnoreCase("y");
        this.males = males.equalsIgnoreCase("y");
        this.migrants = migrants.equalsIgnoreCase("y");
        this.otherBeneficiaries = otherBeneficiaries.equalsIgnoreCase("y");
        this.otherCharities = otherCharities.equalsIgnoreCase("y");
        this.homelessness = homelessness.equalsIgnoreCase("y");
        this.chronic_illness = chronic_illness.equalsIgnoreCase("y");
        this.disabilities = disabilities.equalsIgnoreCase("y");
        this.prePostReleaseOffenders = prePostReleaseOffenders.equalsIgnoreCase("y");
        this.rural = rural.equalsIgnoreCase("y");
        this.unemployed = unemployed.equalsIgnoreCase("y");
        this.veterans = veterans.equalsIgnoreCase("y");
        this.victims_of_crime = victims_of_crime.equalsIgnoreCase("y");
        this.victims_of_disaster = victims_of_disaster.equalsIgnoreCase("y");
        this.youth = youth.equalsIgnoreCase("y");
    }

    public String getId() {
        return id;
    }

    public BigInteger getAbn() {
        return abn;
    }

    public String getName() {
        return name;
    }

    public String getOtherName() {
        return otherName;
    }

    public String getAddressType() {
        return addressType;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public String getAddressLine3() {
        return addressLine3;
    }

    public String getTownCity() {
        return townCity;
    }

    public String getState() {
        return state;
    }

    public String getPostcode() {
        return postcode;
    }

    public String getCountry() {
        return country;
    }

    public String getWebsiteUrl() {
        return websiteUrl;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public Date getEstablishedDate() {
        return establishedDate;
    }

    public String getCharitySize() {
        return charitySize;
    }

    public int getNumberOfResponsiblePersons() {
        return numberOfResponsiblePersons;
    }

    public String getFinancialYearEnd() {
        return financialYearEnd;
    }

    public boolean isOperates_in_act() {
        return operates_in_act;
    }

    public boolean isOperates_in_nsw() {
        return operates_in_nsw;
    }

    public boolean isOperates_in_nt() {
        return operates_in_nt;
    }

    public boolean isOperates_in_qld() {
        return operates_in_qld;
    }

    public boolean isOperates_in_sa() {
        return operates_in_sa;
    }

    public boolean isOperates_in_tas() {
        return operates_in_tas;
    }

    public boolean isOperates_in_vic() {
        return operates_in_vic;
    }

    public boolean isOperates_in_wa() {
        return operates_in_wa;
    }

    public String getOperatingCountries() {
        return operatingCountries;
    }

    public boolean isPbi() {
        return pbi;
    }

    public boolean isHpc() {
        return hpc;
    }

    public boolean isAnimals() {
        return animals;
    }

    public boolean isCulture() {
        return culture;
    }

    public boolean isEducation() {
        return education;
    }

    public boolean isHealth() {
        return health;
    }

    public boolean isLaw() {
        return law;
    }

    public boolean isNaturalEnvironment() {
        return naturalEnvironment;
    }

    public boolean isHuman_rights() {
        return human_rights;
    }

    public boolean isGeneralPublic() {
        return generalPublic;
    }

    public boolean isReconciliation() {
        return reconciliation;
    }

    public boolean isReligion() {
        return religion;
    }

    public boolean isPublicWelfare() {
        return publicWelfare;
    }

    public boolean isSecurity() {
        return security;
    }

    public boolean isAboriginal_or_torres_strait_islanders() {
        return aboriginal_or_torres_strait_islanders;
    }

    public boolean isAdults() {
        return adults;
    }

    public boolean isElderly() {
        return elderly;
    }

    public boolean isChildren() {
        return children;
    }

    public boolean isOverseas() {
        return overseas;
    }

    public boolean isEarlyChildhood() {
        return earlyChildhood;
    }

    public boolean isEthnicGroups() {
        return ethnicGroups;
    }

    public boolean isFamilies() {
        return families;
    }

    public boolean isFemales() {
        return females;
    }

    public boolean isFinancial() {
        return financial;
    }

    public boolean isLgbtPlus() {
        return lgbtPlus;
    }

    public boolean isGeneralCommunity() {
        return generalCommunity;
    }

    public boolean isMales() {
        return males;
    }

    public boolean isMigrants() {
        return migrants;
    }

    public boolean isOtherBeneficiaries() {
        return otherBeneficiaries;
    }

    public boolean isOtherCharities() {
        return otherCharities;
    }

    public boolean isHomelessness() {
        return homelessness;
    }

    public boolean isChronic_illness() {
        return chronic_illness;
    }

    public boolean isDisabilities() {
        return disabilities;
    }

    public boolean isPrePostReleaseOffenders() {
        return prePostReleaseOffenders;
    }

    public boolean isRural() {
        return rural;
    }

    public boolean isUnemployed() {
        return unemployed;
    }

    public boolean isVeterans() {
        return veterans;
    }

    public boolean isVictims_of_crime() {
        return victims_of_crime;
    }

    public boolean isVictims_of_disaster() {
        return victims_of_disaster;
    }

    public boolean isYouth() {
        return youth;
    }

}