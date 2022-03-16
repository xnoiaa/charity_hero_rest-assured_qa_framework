import core.be.FundApi;
import core.be.dto.magnetto.Banks;
import core.be.dto.magnetto.FundModel;
import core.be.dto.magnetto.Phones;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class FoundTestSuite {

    @Test
    public void secondIdCheck() {

        FundApi fundApi = new FundApi();
        FundModel fundModel = new FundModel();
        fundModel = fundApi.getMethod(2);
        FundModel fundModelExpected = new FundModel();

        Phones[] phones = new Phones[] {};

        Banks banksExpected = new Banks();
        banksExpected.setId(1);
        banksExpected.setBeneficiaryAccount("BE59967022364526");
        banksExpected.setBeneficiaryName("MAGNETTO INTERNATIONAL LIMITED");
        banksExpected.setBeneficiaryBankName("WISE EUROPE SA");
        banksExpected.setBeneficiaryBankSwift("TRWIBEB1XXX");
        banksExpected.setBeneficiaryBankAddress("Avenue Louise 54, Room S52 Brussels 1050 Belgium");

        Banks[] banks =new Banks[] {banksExpected};

        fundModelExpected.setBanks(banks);
        fundModelExpected.setPhones(phones);
        fundModelExpected.setId(2);
        fundModelExpected.setTitle("Charity Hero program");
        fundModelExpected.setSubTitle("To help Ukraine");
        fundModelExpected.setDescription("Centralized mobile help program for Ukraine, targeted at users around the world with a guaranteed targeted humanitarian delivery based on the real needs of the funds and volunteers of Ukraine");
        fundModelExpected.setEmail("social@charityhero.live");
        fundModelExpected.setCategoryId(1);
        fundModelExpected.setFacebook("https://www.facebook.com/magnetto.store");
        fundModelExpected.setUrl("https://www.charityhero.live/");
        fundModelExpected.setIban("BE59967022364526");
        fundModelExpected.setEdpnou(11970001);
        fundModelExpected.setPaymentPurpose("CHARITABLE DONATION");

        String [] images = new String [1];
        images[0]="77dc7e06-4de1-4992-8275-e3d1d0676a2a";
        fundModelExpected.setImages(images);

        Assert.assertEquals(fundModel, fundModelExpected);
    }

    @Test
    public void thirdIdCheck() {

        FundApi fundApi = new FundApi();
        FundModel fundModel = new FundModel();
        fundModel = fundApi.getMethod(3);
        FundModel fundModelExpected = new FundModel();

        Phones phonesExpected  = new Phones();
        phonesExpected.setTypeId(2);
        phonesExpected.setPhoneNumber("+380673749190");

        Phones[] phones = new Phones[] {phonesExpected};

        Banks banksExpected = new Banks();
        banksExpected.setId(2);
        banksExpected.setBeneficiaryAccount("UA793253650000002600801913626");
        banksExpected.setBeneficiaryBankSwift("WUCBUA2X");
        banksExpected.setIntermediarySwift("KREDBEBB");
        banksExpected.setBeneficiaryName("International Charity Foundation Caritas Ukraine");
        banksExpected.setBeneficiaryBankName("JSC KREDOBANK");
        banksExpected.setBeneficiaryBankAddress("street Nalyvayka, 6, Lviv, Ukraine");// з бека приходить без вулиці
        banksExpected.setIntermediaryName("KBC BANK NV");
        banksExpected.setIntermediaryAddress("Brussels , Belgium");

        Banks[] banks =new Banks[] {banksExpected};

        fundModelExpected.setBanks(banks);

        fundModelExpected.setPhones(phones);
        fundModelExpected.setId(3);
        fundModelExpected.setTitle("CARITAS UKRAINE");
        fundModelExpected.setSubTitle("To help refugees in Ukraine");
        fundModelExpected.setDescription("Caritas Ukraine is one of the largest international networks of charitable organizations both in Europe and in the whole world. \n" +
                "The word `Caritas` means both love and mercy, compassion and charity.\n" +
                "Hundreds of thousands of Ukrainians in need have received material, social, psychological and legal assistance thanks to our work over 26 years. The work of Caritas Ukraine is focused on 6 main areas:\n" +
                "• Helping children, youth and families in crisis\n" +
                "• Healthcare\n" +
                "• Helping people with disabilities\n" +
                "• Social problems of migration\n" +
                "• Emergency help\n" +
                "• Community Building");
        fundModelExpected.setEmail("secretary@caritas.ua");
        fundModelExpected.setCategoryId(1);
        fundModelExpected.setTwitter("https://twitter.com/caritasukraine");
        fundModelExpected.setFacebook("https://www.facebook.com/caritasukraine");
        fundModelExpected.setInstagram("https://www.instagram.com/caritasukraine/");
        fundModelExpected.setUrl("https://caritas.ua/");
        fundModelExpected.setIban("UA793253650000002600801913626");
        fundModelExpected.setEdpnou(21695710);
        fundModelExpected.setPaymentPurpose("CHARITABLE DONATION FOR CARITAS UKRAINE");

        String [] images = new String [1];
        images[0]="2932eb17-57ec-4105-8821-f657d8acf489";
        fundModelExpected.setImages(images);

        Assert.assertEquals(fundModelExpected, fundModel);
    }

    @Test
    public void fourIdCheck() {

        FundApi fundApi = new FundApi();
        FundModel fundModel = new FundModel();
        fundModel = fundApi.getMethod(4);
        FundModel fundModelExpected = new FundModel();

        Phones phonesExpected  = new Phones();
        phonesExpected.setTypeId(2);
        phonesExpected.setPhoneNumber("+380685008800");

        Phones[] phones = new Phones[] {phonesExpected};

        Banks banksExpected = new Banks();
        banksExpected.setId(4);
        banksExpected.setBeneficiaryAccount("UA093052990000026004025029786");
        banksExpected.setBeneficiaryBankSwift("PBANUA2X");
        banksExpected.setBeneficiaryName("CO `INTERNATIONAL CHARITABLE FOUNDATION `COME BACK ALIVE`");
        banksExpected.setBeneficiaryBankName("JSC CB `PRIVATBANK`");
        banksExpected.setBeneficiaryBankAddress("1D HRUSHEVSKOHO STR., KYIV, 01001, UKRAINE");

        Banks[] banks =new Banks[] {banksExpected};

        fundModelExpected.setBanks(banks);

        fundModelExpected.setPhones(phones);
        fundModelExpected.setId(4);
        fundModelExpected.setTitle("CO \"INTERNATIONAL CHARITABLE FOUNDATION \"COME BACK ALIVE\" ");
        fundModelExpected.setSubTitle("Help the Ukrainian Army");
        fundModelExpected.setDescription("\"Come Back Alive\" is a multi-purpose non-governmental organization consisting of a charitable foundation with the help of the army, a military training department, a veterans' department, an think tank and niche media.\n" +
                "All funds received by the Charitable Foundation are used exclusively for the needs of the army.");
        fundModelExpected.setEmail("office@savelife.in.ua");
        fundModelExpected.setCategoryId(1);
       // fundModelExpected.setTwitter("string");
        fundModelExpected.setFacebook("https://www.facebook.com/backandalive/");
        //fundModelExpected.setInstagram("string");
        fundModelExpected.setUrl("https://savelife.in.ua/");
        fundModelExpected.setIban("UA093052990000026004025029786");
        fundModelExpected.setEdpnou(39696398);
        fundModelExpected.setPaymentPurpose("Charitable donation to Ukrainian military");

        String [] images = new String [1];
        images[0]="3debb62b-6a7b-44f8-9f87-5f09e1e363b8";
        fundModelExpected.setImages(images);

        Assert.assertEquals(fundModelExpected, fundModel);
    }

    @Test
    public void fiveIdCheck() {

        FundApi fundApi = new FundApi();
        FundModel fundModel = new FundModel();
        fundModel = fundApi.getMethod(5);
        FundModel fundModelExpected = new FundModel();

        Phones phonesExpected  = new Phones();
        phonesExpected.setTypeId(1);
        phonesExpected.setPhoneNumber("+380800505240");

        Phones[] phones = new Phones[] {phonesExpected};

        Banks banksExpected = new Banks();
        banksExpected.setId(5);
        banksExpected.setBeneficiaryAccount("DE05504000005040040066");
        banksExpected.setBeneficiaryBankSwift("MARKDEFF");
        banksExpected.setBeneficiaryName("National Bank of Ukraine");
        banksExpected.setBeneficiaryBankName("DEUTSCHE BUNDESBANK, Frankfurt");
        banksExpected.setBeneficiaryBankAddress("Wilhelm-Epstein-Strasse 14, 60431 Frankfurt Am Main, Germany");

        Banks[] banks =new Banks[] {banksExpected};

        fundModelExpected.setBanks(banks);
        fundModelExpected.setPhones(phones);
        fundModelExpected.setId(5);
        fundModelExpected.setTitle("National Bank of Ukraine");
        fundModelExpected.setSubTitle("Help the Ukrainian Army");
        fundModelExpected.setDescription("The National Bank of Ukraine has decided to open a special fundraising account to support the Armed Forces of Ukraine.\n" +
                "The central bank’s decision comes after the Ukrainian government imposed martial law throughout Ukraine in response to armed aggression by Russia and the renewed threat to Ukraine’s independence and territorial integrity.\n" +
                "Support the Armed Forces of Ukraine!");
        fundModelExpected.setEmail("nbu@bank.gov.ua");
        fundModelExpected.setCategoryId(1);
        fundModelExpected.setTwitter("https://twitter.com/NBUkraine");
        fundModelExpected.setFacebook("https://www.facebook.com/NationalBankOfUkraine");
        fundModelExpected.setInstagram("https://www.instagram.com/national_bank_of_ukraine/");
        fundModelExpected.setUrl("https://bank.gov.ua/");
        fundModelExpected.setIban("DE05504000005040040066");
        fundModelExpected.setEdpnou(32106);
        fundModelExpected.setPaymentPurpose("for crediting account 47330992708");

        String [] images = new String [1];
        images[0]="ddf61f2e-f525-46bd-9d46-b46be7b2d437";
        fundModelExpected.setImages(images);

        Assert.assertEquals(fundModelExpected, fundModel);
    }

    @Test
    public void sixIdCheck() {

        FundApi fundApi = new FundApi();
        FundModel fundModel = new FundModel();
        fundModel = fundApi.getMethod(6);
        FundModel fundModelExpected = new FundModel();

        Phones phonesExpected  = new Phones();
        phonesExpected.setTypeId(1);
        phonesExpected.setPhoneNumber("+380442898622");

        Phones[] phones = new Phones[] {phonesExpected};

        Banks banksExpected = new Banks();
        banksExpected.setId(6);
        banksExpected.setBeneficiaryAccount("DE85500000000050002137");
        banksExpected.setBeneficiaryName("Ministry of Social Policy of Ukraine");
        banksExpected.setBeneficiaryBankName("DEUTSCHE BUNDESBANK, Frankfurt");
        banksExpected.setBeneficiaryBankSwift("MARKDEFF");
        banksExpected.setBeneficiaryBankAddress("Wilhelm-Epstein-Strasse 14, 60431 Frankfurt Am Main, Germany");

        Banks[] banks =new Banks[] {banksExpected};

        fundModelExpected.setBanks(banks);
        fundModelExpected.setPhones(phones);
        fundModelExpected.setId(6);
        fundModelExpected.setTitle("Ministry of Social Policy of Ukraine");
        fundModelExpected.setSubTitle("Social issues");
        fundModelExpected.setDescription("The account is meant for charity contributions from Ukraine and from abroad. The Ministry of Social Policy will channel the raised funds to support Ukraine’s citizens severely affected by the war.");
        fundModelExpected.setEmail("info@mlsp.gov.ua");
        fundModelExpected.setCategoryId(1);
        fundModelExpected.setTwitter("https://twitter.com/MinSocUA?fbclid=IwAR25fQ_I7iZqgYShe1pWU7iFsY00F6LGIjeDecmAu1w1HIbcPorX7RVXpZw");
        fundModelExpected.setFacebook("https://www.facebook.com/MLSP.gov.ua?sk=wall");
      //  fundModelExpected.setInstagram("string"); expected null
        fundModelExpected.setUrl("https://www.msp.gov.ua/");
        fundModelExpected.setIban("DE85500000000050002137");
        fundModelExpected.setEdpnou(37567866);
        fundModelExpected.setPaymentPurpose("for crediting account 32302338301027");

        String [] images = new String [1];
        images[0]="4673bd53-954f-4cbd-93af-8f9081a5a08a";
        fundModelExpected.setImages(images);

        Assert.assertEquals(fundModelExpected, fundModel);
    }

    @Test
    public void sevenIdCheck() {

        FundApi fundApi = new FundApi();
        FundModel fundModel = new FundModel();
        fundModel = fundApi.getMethod(7);
        FundModel fundModelExpected = new FundModel();

        Phones phonesExpected  = new Phones();
        phonesExpected.setTypeId(2);
        phonesExpected.setPhoneNumber("+380677635450");

        Phones[] phones = new Phones[] {phonesExpected};

        Banks banksExpected = new Banks();
        banksExpected.setId(7);
        banksExpected.setBeneficiaryAccount("UA523052990000026007046710253");
        banksExpected.setBeneficiaryName("Centre `The home of happy children`");
        banksExpected.setBeneficiaryBankName("JSC CB PRIVATBANK");
        banksExpected.setBeneficiaryBankSwift("PBANUA2X");
        banksExpected.setBeneficiaryBankAddress("street Naberezhna Peremohy, 50, Dnipro, Ukraine");

        Banks[] banks =new Banks[] {banksExpected};

        fundModelExpected.setBanks(banks);
        fundModelExpected.setPhones(phones);
        fundModelExpected.setId(7);
        fundModelExpected.setTitle("Centre `The home of happy children`");
        fundModelExpected.setSubTitle("Social issues");
        fundModelExpected.setDescription("Centre “The home of happy children” has been helping dispossessed children since 2007.Our main aim is the care about children, to create the atmosphere of some family coziness for them, to support them with all necessary things for full and all-round development while the kid is searching for his family. We help to find such family for every child, where he’ll want to live in.");
        fundModelExpected.setEmail("mistoditey@gmail.com");
        fundModelExpected.setCategoryId(1);
    //    fundModelExpected.setTwitter("string");
        fundModelExpected.setFacebook("https://www.facebook.com/mistoditey.org");
       // fundModelExpected.setInstagram("string");
        fundModelExpected.setUrl("https://mistoditey.org/");
        fundModelExpected.setIban("UA523052990000026007046710253");
        fundModelExpected.setEdpnou(35133314);
        fundModelExpected.setPaymentPurpose("Charitable donation to children");

        String [] images = new String [1];
        images[0]="d7e5d57a-3f60-4c4b-b837-c1ea6eef460e";
        fundModelExpected.setImages(images);

        Assert.assertEquals(fundModelExpected, fundModel);
    }

    @Test
    public void eightIdCheck() {

        FundApi fundApi = new FundApi();
        FundModel fundModel = new FundModel();
        fundModel = fundApi.getMethod(8);
        FundModel fundModelExpected = new FundModel();

        Phones phonesExpected  = new Phones();
        phonesExpected.setTypeId(2);
        phonesExpected.setPhoneNumber("+380502541811");

        Phones[] phones = new Phones[] {phonesExpected};

        Banks banksExpected = new Banks();
        banksExpected.setId(8);
        banksExpected.setBeneficiaryAccount("UA943052990000026003036212196");
        banksExpected.setBeneficiaryName("International Charity Foundation `EverybodyCan`");
        banksExpected.setBeneficiaryBankName("JSC CB PRIVATBANK");
        banksExpected.setBeneficiaryBankSwift("PBANUA2X");
        banksExpected.setBeneficiaryBankAddress("1D HRUSHEVSKOHO, STR., KYIV, 01001, UKRAINE");

        Banks[] banks =new Banks[] {banksExpected};

        fundModelExpected.setBanks(banks);
        fundModelExpected.setPhones(phones);
        fundModelExpected.setId(8);
        fundModelExpected.setTitle("International Charity Foundation `EverybodyCan`");
        fundModelExpected.setSubTitle("Social issues");
        fundModelExpected.setDescription("We are the Everybody Can foundation.\n" +
                "We are a community of caring people united by common values. This community comprises the foundation's team, philanthropists and volunteers, parents and children. It consists of all those who make it possible to help children with disabilities, help hospitals and the elderly.\n" +
                "We believe in the importance of everyone's contribution.");
        fundModelExpected.setEmail("everybodycan.ua@gmail.com");
        fundModelExpected.setCategoryId(1);
      //  fundModelExpected.setTwitter("string");
        fundModelExpected.setFacebook("https://www.facebook.com/everybody.can.ua/");
        fundModelExpected.setInstagram("https://www.instagram.com/everybodycan.ua/?fbclid=IwAR27LRwFsZ8LG5rx11cAHv3cd5O8zWXux_EXlis7ul43JomzT_f9sRQwbVE");
        fundModelExpected.setUrl("https://everybodycan.com.ua/");
        fundModelExpected.setIban("UA943052990000026003036212196");
        fundModelExpected.setEdpnou(39358226);
        fundModelExpected.setPaymentPurpose("Сharitable donation to statutory activities without VAT");

        String [] images = new String [1];
        images[0]="53077a0f-ec20-4084-b341-f983ab02c30d";
        fundModelExpected.setImages(images);

        Assert.assertEquals(fundModelExpected, fundModel);
    }

    @Test
    public void nineIdCheck() {

        FundApi fundApi = new FundApi();
        FundModel fundModel = new FundModel();
        fundModel = fundApi.getMethod(9);
        FundModel fundModelExpected = new FundModel();

        Phones phonesExpected  = new Phones();
        phonesExpected.setTypeId(2);
        phonesExpected.setPhoneNumber("+380672461722");

        Phones[] phones = new Phones[] {phonesExpected};

        Banks banksExpected = new Banks();
        banksExpected.setId(9);
        banksExpected.setBeneficiaryAccount("UA473052990000026008006800726");
        banksExpected.setBeneficiaryName("СHARITABLE FOUNDATION `KYIAN`");
        banksExpected.setBeneficiaryBankName("JSC CB PRIVATBANK");
        banksExpected.setBeneficiaryBankSwift("PBANUA2X");
        banksExpected.setBeneficiaryBankAddress("1D HRUSHEVSKOHO STR., KYIV, 01001, UKRAINE");
        banksExpected.setIntermediaryName("Commerzbank AG");
        banksExpected.setIntermediarySwift("COBADEFF");
        banksExpected.setIntermediaryAddress("Frankfurt am Main");
        banksExpected.setCorrespondentBankAccount("400886700401");

        Banks[] banks =new Banks[] {banksExpected};

        fundModelExpected.setBanks(banks);
        fundModelExpected.setPhones(phones);
        fundModelExpected.setId(9);
        fundModelExpected.setTitle("СHARITABLE FOUNDATION `KYIAN`");
        fundModelExpected.setSubTitle("Help for Kyiv");

        fundModelExpected.setEmail("fondkian@gmail.com");
        fundModelExpected.setCategoryId(1);
        fundModelExpected.setFacebook( "https://www.facebook.com/kiyancharity/");
        fundModelExpected.setUrl("https://kiyan.com.ua/");
        fundModelExpected.setIban("UA473052990000026008006800726");
        fundModelExpected.setEdpnou(41302612);
        fundModelExpected.setPaymentPurpose("Сharitable donation to statutory activities");

        String [] images = new String [1];
        images[0]="77f27729-f7cd-48d5-83f0-9a4cec014b4c";
        fundModelExpected.setImages(images);

        Assert.assertEquals(fundModelExpected, fundModel);
    }

    @Test
    public void elevenIdCheck() {

        FundApi fundApi = new FundApi();
        FundModel fundModel = new FundModel();
        fundModel = fundApi.getMethod(11);
        FundModel fundModelExpected = new FundModel();

        Phones phonesExpected  = new Phones();
        phonesExpected.setTypeId(1);
        phonesExpected.setPhoneNumber("+380800309308");

        Phones[] phones = new Phones[] {phonesExpected};

        Banks banksExpected = new Banks();
        banksExpected.setId(10);
        banksExpected.setBeneficiaryAccount("UA713052990000026007040811147");
        banksExpected.setBeneficiaryName("CIVIL FORMATION FOR PROTECTION OF PUBLIC ORDER `SELF-DEFENSE NOVOLYNSK`");
        banksExpected.setBeneficiaryBankName("JSC CB PRIVATBANK");
        banksExpected.setBeneficiaryBankSwift("PBANUA2X");
        banksExpected.setBeneficiaryBankAddress("1D HRUSHEVSKOHO STR., KYIV, 01001, UKRAINE");

        Banks[] banks =new Banks[] {banksExpected};

        fundModelExpected.setBanks(banks);
        fundModelExpected.setPhones(phones);
        fundModelExpected.setId(11);
        fundModelExpected.setTitle("CIVIL FORMATION FOR PROTECTION OF PUBLIC ORDER `SELF-DEFENSE NOVOLYNSK`");
        fundModelExpected.setSubTitle("Help for Volyn region");
        fundModelExpected.setDescription("We are ordinary Ukrainians, have changed our jobs to one common one, that is to become a reliable rear for the defenders of Volyn region and to help people who come to us from cities where hostilities are taking place.\n" +
                "We are actively analyzing the needs of our military and the displaced, working with volunteers and companies that can provide us with what we need.\n" +
                "We are transparent and open to report regularly on our work.\n" +
                "If you want to help our military and bring our common victory closer, join the NOVOVOLYNSK.HELP foundation, because together we are a great invincible force!");
        fundModelExpected.setEmail("info@novovolynsk.help");
        fundModelExpected.setCategoryId(1);
        fundModelExpected.setTwitter("string");
        fundModelExpected.setFacebook("https://www.facebook.com/novik.help/");
        fundModelExpected.setInstagram("https://www.instagram.com/novovolynsk.help/");
        fundModelExpected.setUrl("https://novovolynsk.help/");
        fundModelExpected.setIban("UA713052990000026007040811147");
        fundModelExpected.setEdpnou(39144969);
        fundModelExpected.setPaymentPurpose("Charitable donation to CIVIL FORMATION FOR PROTECTION OF PUBLIC ORDER `SELF-DEFENSE NOVOLYNSK`");

        String [] images = new String [1];
        images[0]="d1556bab-b531-4c00-a997-6d0a9b673e7a";
        fundModelExpected.setImages(images);

        Assert.assertEquals(fundModelExpected, fundModel);
    }

 //   @Test
//    public void postTest() throws IOException {
//        FundApi fundApi = new FundApi();
//        fundApi.postJsonFile();
//    }

}