package com.keecoding.flagquizz

class CountryCodes {

    companion object{
        val COUNTRY_CODES = arrayOf("AF", "AX", "AL", "DZ", "AS", "AD", "AO", "AI", "AQ",
            "AG", "AR", "AM", "AW", "AU", "AT", "AZ", "BS", "BH", "BD", "BB", "BY", "BE",
            "BZ", "BJ", "BM", "BT", "BO", "BA", "BW", "BV", "BR", "IO", "BN", "BG",
            "BF", "BI", "KH", "CM", "CA", "CV", "KY", "CF", "TD", "CL", "CN", "CX", "CC",
            "CO", "KM", "CG", "CD", "CK", "CR", "CI", "HR", "CU", "CY", "CZ", "DK",
            "DJ", "DM", "DO", "EC", "EG", "SV", "GQ", "ER", "EE", "ET", "FK", "FO", "FJ",
            "FI", "FR", "GF", "PF", "TF", "GA", "GM", "GE", "DE", "GH", "GI", "GR", "GL",
            "GD", "GP", "GU", "GT", "GG", "GN", "GW", "GY", "HT", "HM", "VA", "HN", "HK",
            "HU", "IS", "IN", "ID", "IR", "IQ", "IE", "IM", "IL", "IT", "JM", "JP", "JE",
            "JO", "KZ", "KE", "KI", "KR", "KW", "KG", "LA", "LV", "LB", "LS",
            "LR", "LY", "LI", "LT", "LU", "MO", "MK", "MG", "MW", "MY", "MV", "ML", "MT",
            "MH", "MQ", "MR", "MU", "YT", "MX", "FM", "MD", "MC", "MN", "ME", "MS", "MA",
            "MZ", "MM", "NA", "NR", "NP", "NL", "NC", "NZ", "NI", "NE", "NG", "NU",
            "NF", "MP", "NO", "OM", "PK", "PW", "PS", "PA", "PG", "PY", "PE", "PH", "PN",
            "PL", "PT", "PR", "QA", "RE", "RO", "RU", "RW", "BL", "SH", "KN", "LC", "MF",
            "PM", "VC", "WS", "SM", "ST", "SA", "SN", "RS", "SC", "SL", "SG",
            "SK", "SI", "SB", "SO", "ZA", "GS", "ES", "LK", "SD", "SR", "SJ", "SZ",
            "SE", "CH", "SY", "TW", "TJ", "TZ", "TH", "TL", "TG", "TK", "TO", "TT", "TN",
            "TR", "TM", "TC", "TV", "UG", "UA", "AE", "GB", "US", "UM", "UY", "UZ", "VU",
            "VE", "VN", "VG", "VI", "WF", "EH", "YE", "ZM", "ZW")

        val COUNTRY_MAP = mapOf(
            "AF" to "Afghanistan",
            "AX" to "Aland Islands",
            "AL" to "Albania",
            "DZ" to "Algeria",
            "AS" to "American Samoa",
            "AD" to "Andorra",
            "AO" to "Angola",
            "AI" to "Anguilla",
            "AQ" to "Antarctica",
            "AG" to "Antigua And Barbuda",
            "AR" to "Argentina",
            "AM" to "Armenia",
            "AW" to "Aruba",
            "AU" to "Australia",
            "AT" to "Austria",
            "AZ" to "Azerbaijan",
            "BS" to "Bahamas",
            "BH" to "Bahrain",
            "BD" to "Bangladesh",
            "BB" to "Barbados",
            "BY" to "Belarus",
            "BE" to "Belgium",
            "BZ" to "Belize",
            "BJ" to "Benin",
            "BM" to "Bermuda",
            "BT" to "Bhutan",
            "BO" to "Bolivia",
            "BA" to "Bosnia And Herzegovina",
            "BW" to "Botswana",
            "BV" to "Bouvet Island",
            "BR" to "Brazil",
            "IO" to "British Indian Ocean Territory",
            "BN" to "Brunei Darussalam",
            "BG" to "Bulgaria",
            "BF" to "Burkina Faso",
            "BI" to "Burundi",
            "KH" to "Cambodia",
            "CM" to "Cameroon",
            "CA" to "Canada",
            "CV" to "Cape Verde",
            "KY" to "Cayman Islands",
            "CF" to "Central African Republic",
            "TD" to "Chad",
            "CL" to "Chile",
            "CN" to "China",
            "CX" to "Christmas Island",
            "CC" to "Cocos (Keeling) Islands",
            "CO" to "Colombia",
            "KM" to "Comoros",
            "CG" to "Congo",
            "CD" to "Congo, Democratic Republic",
            "CK" to "Cook Islands",
            "CR" to "Costa Rica",
            "CI" to "Cote D'Ivoire",
            "HR" to "Croatia",
            "CU" to "Cuba",
            "CY" to "Cyprus",
            "CZ" to "Czech Republic",
            "DK" to "Denmark",
            "DJ" to "Djibouti",
            "DM" to "Dominica",
            "DO" to "Dominican Republic",
            "EC" to "Ecuador",
            "EG" to "Egypt",
            "SV" to "El Salvador",
            "GQ" to "Equatorial Guinea",
            "ER" to "Eritrea",
            "EE" to "Estonia",
            "ET" to "Ethiopia",
            "FK" to "Falkland Islands (Malvinas)",
            "FO" to "Faroe Islands",
            "FJ" to "Fiji",
            "FI" to "Finland",
            "FR" to "France",
            "GF" to "French Guiana",
            "PF" to "French Polynesia",
            "TF" to "French Southern Territories",
            "GA" to "Gabon",
            "GM" to "Gambia",
            "GE" to "Georgia",
            "DE" to "Germany",
            "GH" to "Ghana",
            "GI" to "Gibraltar",
            "GR" to "Greece",
            "GL" to "Greenland",
            "GD" to "Grenada",
            "GP" to "Guadeloupe",
            "GU" to "Guam",
            "GT" to "Guatemala",
            "GG" to "Guernsey",
            "GN" to "Guinea",
            "GW" to "Guinea-Bissau",
            "GY" to "Guyana",
            "HT" to "Haiti",
            "HM" to "Heard Island & Mcdonald Islands",
            "VA" to "Holy See (Vatican City State)",
            "HN" to "Honduras",
            "HK" to "Hong Kong",
            "HU" to "Hungary",
            "IS" to "Iceland",
            "IN" to "India",
            "ID" to "Indonesia",
            "IR" to "Islamic Republic Of Iran",
            "IQ" to "Iraq",
            "IE" to "Ireland",
            "IM" to "Isle Of Man",
            "IL" to "Israel",
            "IT" to "Italy",
            "JM" to "Jamaica",
            "JP" to "Japan",
            "JE" to "Jersey",
            "JO" to "Jordan",
            "KZ" to "Kazakhstan",
            "KE" to "Kenya",
            "KI" to "Kiribati",
            "KR" to "Korea",
            "KW" to "Kuwait",
            "KG" to "Kyrgyzstan",
            "LA" to "Lao People's Democratic Republic",
            "LV" to "Latvia",
            "LB" to "Lebanon",
            "LS" to "Lesotho",
            "LR" to "Liberia",
            "LY" to "Libyan Arab Jamahiriya",
            "LI" to "Liechtenstein",
            "LT" to "Lithuania",
            "LU" to "Luxembourg",
            "MO" to "Macao",
            "MK" to "Macedonia",
            "MG" to "Madagascar",
            "MW" to "Malawi",
            "MY" to "Malaysia",
            "MV" to "Maldives",
            "ML" to "Mali",
            "MT" to "Malta",
            "MH" to "Marshall Islands",
            "MQ" to "Martinique",
            "MR" to "Mauritania",
            "MU" to "Mauritius",
            "YT" to "Mayotte",
            "MX" to "Mexico",
            "FM" to "Federated States Of Micronesia",
            "MD" to "Moldova",
            "MC" to "Monaco",
            "MN" to "Mongolia",
            "ME" to "Montenegro",
            "MS" to "Montserrat",
            "MA" to "Morocco",
            "MZ" to "Mozambique",
            "MM" to "Myanmar",
            "NA" to "Namibia",
            "NR" to "Nauru",
            "NP" to "Nepal",
            "NL" to "Netherlands",
            "NC" to "New Caledonia",
            "NZ" to "New Zealand",
            "NI" to "Nicaragua",
            "NE" to "Niger",
            "NG" to "Nigeria",
            "NU" to "Niue",
            "NF" to "Norfolk Island",
            "MP" to "Northern Mariana Islands",
            "NO" to "Norway",
            "OM" to "Oman",
            "PK" to "Pakistan",
            "PW" to "Palau",
            "PS" to "Palestine",
            "PA" to "Panama",
            "PG" to "Papua New Guinea",
            "PY" to "Paraguay",
            "PE" to "Peru",
            "PH" to "Philippines",
            "PN" to "Pitcairn",
            "PL" to "Poland",
            "PT" to "Portugal",
            "PR" to "Puerto Rico",
            "QA" to "Qatar",
            "RE" to "Reunion",
            "RO" to "Romania",
            "RU" to "Russian Federation",
            "RW" to "Rwanda",
            "BL" to "Saint Barthelemy",
            "SH" to "Saint Helena",
            "KN" to "Saint Kitts And Nevis",
            "LC" to "Saint Lucia",
            "MF" to "Saint Martin",
            "PM" to "Saint Pierre And Miquelon",
            "VC" to "Saint Vincent And Grenadines",
            "WS" to "Samoa",
            "SM" to "San Marino",
            "ST" to "Sao Tome And Principe",
            "SA" to "Saudi Arabia",
            "SN" to "Senegal",
            "RS" to "Serbia",
            "SC" to "Seychelles",
            "SL" to "Sierra Leone",
            "SG" to "Singapore",
            "SK" to "Slovakia",
            "SI" to "Slovenia",
            "SB" to "Solomon Islands",
            "SO" to "Somalia",
            "ZA" to "South Africa",
            "GS" to "South Georgia And Sandwich Isl.",
            "ES" to "Spain",
            "LK" to "Sri Lanka",
            "SD" to "Sudan",
            "SR" to "Suriname",
            "SJ" to "Svalbard And Jan Mayen",
            "SZ" to "Swaziland",
            "SE" to "Sweden",
            "CH" to "Switzerland",
            "SY" to "Syrian Arab Republic",
            "TW" to "Taiwan",
            "TJ" to "Tajikistan",
            "TZ" to "Tanzania",
            "TH" to "Thailand",
            "TL" to "Timor-Leste",
            "TG" to "Togo",
            "TK" to "Tokelau",
            "TO" to "Tonga",
            "TT" to "Trinidad And Tobago",
            "TN" to "Tunisia",
            "TR" to "Turkey",
            "TM" to "Turkmenistan",
            "TC" to "Turks And Caicos Islands",
            "TV" to "Tuvalu",
            "UG" to "Uganda",
            "UA" to "Ukraine",
            "AE" to "United Arab Emirates",
            "GB" to "United Kingdom",
            "US" to "United States",
            "UM" to "United States Outlying Islands",
            "UY" to "Uruguay",
            "UZ" to "Uzbekistan",
            "VU" to "Vanuatu",
            "VE" to "Venezuela",
            "VN" to "Vietnam",
            "VG" to "Virgin Islands, British",
            "VI" to "Virgin Islands, U.S.",
            "WF" to "Wallis And Futuna",
            "EH" to "Western Sahara",
            "YE" to "Yemen",
            "ZM" to "Zambia",
            "ZW" to "Zimbabwe",
        )

    }

}