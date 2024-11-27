package fr.btsciel;


public class LesPaysDeEU {
    public PaysEU [] lesPays = new PaysEU [27];


    public LesPaysDeEU() {
        for (int i = 0; i < lesPays.length; i++) {
            lesPays[i] = new PaysEU();
        }

        lesPays[0].nom = "Allemagne";
        lesPays[0].capitale = "Berlin" ;
        lesPays[0].population = 83445000;
        lesPays[0].superficie = 357569;
        lesPays[0].anneeAdhesion=1958;

        lesPays[1].nom = "France";
        lesPays[1].capitale = "Paris" ;
        lesPays[1].population = 68401997;
        lesPays[1].superficie = 638475;
        lesPays[1].anneeAdhesion=1958;

        lesPays[2].nom = "Portugal";
        lesPays[2].capitale = "Lisbonne" ;
        lesPays[2].population = 10639726;
        lesPays[2].superficie = 92226;
        lesPays[2].anneeAdhesion=1986;

        lesPays[3].nom = "slovenie";
        lesPays[3].capitale = "Ljubljana" ;
        lesPays[3].population = 2123949;
        lesPays[3].superficie = 20273;
        lesPays[3].anneeAdhesion=2004;

        lesPays[4].nom = "Espagne";
        lesPays[4].capitale = "Madrid" ;
        lesPays[4].population = 48610458;
        lesPays[4].superficie = 505983;
        lesPays[4].anneeAdhesion=1986;

        lesPays[5].nom = "Slovaquie";
        lesPays[5].capitale = "Bratislava" ;
        lesPays[5].population = 5424687;
        lesPays[5].superficie = 49035;
        lesPays[5].anneeAdhesion= 2004;

        lesPays[6].nom = "Italie";
        lesPays[6].capitale = "Rome" ;
        lesPays[6].population = 58989749;
        lesPays[6].superficie = 302073;
        lesPays[6].anneeAdhesion=1958;

        lesPays[7].nom = "Autriche";
        lesPays[7].capitale = "Vienne" ;
        lesPays[7].population = 9158750;
        lesPays[7].superficie = 83882;
        lesPays[7].anneeAdhesion=1995;

        lesPays[8].nom = "Pologne";
        lesPays[8].capitale = "Varsovie" ;
        lesPays[8].population = 36620970;
        lesPays[8].superficie = 311928;
        lesPays[8].anneeAdhesion=2004;

        lesPays[9].nom = "Suede";
        lesPays[9].capitale = "Stockholm" ;
        lesPays[9].population = 10551707;
        lesPays[9].superficie = 447424;
        lesPays[9].anneeAdhesion=1995;

        lesPays[10].nom = "Tchequie";
        lesPays[10].capitale = "Prague" ;
        lesPays[10].population = 10900555;
        lesPays[10].superficie = 78871;
        lesPays[10].anneeAdhesion=2004;


        lesPays[11].nom = "Finlande";
        lesPays[11].capitale = "Helsinki" ;
        lesPays[11].population = 5603851;
        lesPays[11].superficie = 338363;
        lesPays[11].anneeAdhesion=1995;

        lesPays[12].nom = "Danemark";
        lesPays[12].capitale = "Copenhague" ;
        lesPays[12].population = 5961249;
        lesPays[12].superficie = 42925;
        lesPays[12].anneeAdhesion=1973;

        lesPays[13].nom = "Grece";
        lesPays[13].capitale = "Athenes" ;
        lesPays[13].population = 10397193;
        lesPays[13].superficie = 131694;
        lesPays[13].anneeAdhesion=1981;

        lesPays[14].nom = "Lettonie";
        lesPays[14].capitale = "Riga" ;
        lesPays[14].population = 1871882;
        lesPays[14].superficie = 64594;
        lesPays[14].anneeAdhesion=2004;

        lesPays[15].nom = "Estonie";
        lesPays[15].capitale = "Tallin" ;
        lesPays[15].population = 1374687;
        lesPays[15].superficie = 45336;
        lesPays[15].anneeAdhesion=2004;

        lesPays[16].nom = "Lituanie";
        lesPays[16].capitale = "Vilnius" ;
        lesPays[16].population = 2885891;
        lesPays[16].superficie = 65284;
        lesPays[16].anneeAdhesion=2004;

        lesPays[17].nom = "Belgique";
        lesPays[17].capitale = "Bruxelles" ;
        lesPays[17].population = 11832049;
        lesPays[17].superficie = 30667;
        lesPays[17].anneeAdhesion=1958;

        lesPays[18].nom = "Bulgarie";
        lesPays[18].capitale = "Sofia" ;
        lesPays[18].population = 6445481;
        lesPays[18].superficie = 110996;
        lesPays[18].anneeAdhesion=2007;

        lesPays[19].nom = "Chypre";
        lesPays[19].capitale = "Nicosie" ;
        lesPays[19].population = 933505;
        lesPays[19].superficie = 9253;
        lesPays[19].anneeAdhesion=2004;

        lesPays[20].nom = "Croatie";
        lesPays[20].capitale = "Zagreb" ;
        lesPays[20].population = 3861967;
        lesPays[20].superficie = 56594;
        lesPays[20].anneeAdhesion=2013;

        lesPays[21].nom = "Roumanie";
        lesPays[21].capitale = "Bucarest" ;
        lesPays[21].population = 19064409;
        lesPays[21].superficie = 238398;
        lesPays[21].anneeAdhesion=2007;


        lesPays[22].nom = "Pays-Bas";
        lesPays[22].capitale = "Amsterdam" ;
        lesPays[22].population = 17942942;
        lesPays[22].superficie = 37391;
        lesPays[22].anneeAdhesion=1958;

        lesPays[23].nom = "Malte";
        lesPays[23].capitale = "La Valette" ;
        lesPays[23].population = 563443;
        lesPays[23].superficie = 316;
        lesPays[23].anneeAdhesion=2007;

        lesPays[24].nom = "Luxembourg";
        lesPays[24].capitale = "Luxembourg" ;
        lesPays[24].population = 672050;
        lesPays[24].superficie = 2595;
        lesPays[24].anneeAdhesion=1958;

        lesPays[25].nom = "Irlande";
        lesPays[25].capitale = "Dublin" ;
        lesPays[25].population = 5343805;
        lesPays[25].superficie = 69947;
        lesPays[25].anneeAdhesion=1973;

        lesPays[26].nom = "Hongrie";
        lesPays[26].capitale = "Budapest" ;
        lesPays[26].population = 9584627;
        lesPays[26].superficie = 93012;
        lesPays[26].anneeAdhesion=2004;

    }

}
