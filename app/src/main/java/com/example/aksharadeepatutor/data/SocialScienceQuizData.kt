package com.example.aksharadeepatutor.data

fun getSocialScienceQuizQuestions(chapterName: String): List<QuizQuestion> {
    return when (chapterName) {
        "Advent of Europeans to India" -> listOf(
            QuizQuestion("Who was the first European to discover sea route to India?", listOf("Vasco da Gama", "Columbus", "Dupleix", "Robert Clive"), "Vasco da Gama"),
            QuizQuestion("Vasco da Gama reached India in:", listOf("1498", "1600", "1757", "1857"), "1498"),
            QuizQuestion("The Portuguese first reached which Indian port?", listOf("Calicut", "Surat", "Bombay", "Madras"), "Calicut"),
            QuizQuestion("The English East India Company was established in:", listOf("1600", "1498", "1757", "1858"), "1600"),
            QuizQuestion("The Battle of Plassey was fought in:", listOf("1757", "1764", "1857", "1947"), "1757")
        )

        "The Extension of the British Rule" -> listOf(
            QuizQuestion("Who introduced the Doctrine of Lapse?", listOf("Lord Dalhousie", "Lord Curzon", "Warren Hastings", "Robert Clive"), "Lord Dalhousie"),
            QuizQuestion("The Battle of Buxar was fought in:", listOf("1764", "1757", "1857", "1799"), "1764"),
            QuizQuestion("Subsidiary Alliance was introduced by:", listOf("Lord Wellesley", "Lord Dalhousie", "Lord Ripon", "Lord Curzon"), "Lord Wellesley"),
            QuizQuestion("Tipu Sultan ruled:", listOf("Mysore", "Bengal", "Punjab", "Delhi"), "Mysore"),
            QuizQuestion("The Fourth Anglo-Mysore War ended in:", listOf("1799", "1757", "1857", "1947"), "1799")
        )

        "The Impact of British Rule in India" -> listOf(
            QuizQuestion("British rule affected Indian economy by:", listOf("Drain of wealth", "Only increasing village industries", "Ending taxes", "Stopping trade"), "Drain of wealth"),
            QuizQuestion("Permanent Zamindari system was introduced in:", listOf("Bengal", "Mysore", "Punjab", "Goa"), "Bengal"),
            QuizQuestion("Who introduced Permanent Settlement?", listOf("Lord Cornwallis", "Lord Dalhousie", "Lord Curzon", "Robert Clive"), "Lord Cornwallis"),
            QuizQuestion("British education policy promoted:", listOf("English education", "Only Sanskrit", "Only Persian", "No education"), "English education"),
            QuizQuestion("Railways in India were first introduced by:", listOf("British", "French", "Dutch", "Portuguese"), "British")
        )

        "Opposition to British Rule in Karnataka" -> listOf(
            QuizQuestion("Kittur Rani Chennamma fought against:", listOf("British", "Portuguese", "French", "Dutch"), "British"),
            QuizQuestion("Sangolli Rayanna was associated with:", listOf("Kittur revolt", "Plassey battle", "Buxar battle", "Quit India"), "Kittur revolt"),
            QuizQuestion("Kittur is located in:", listOf("Karnataka", "Kerala", "Tamil Nadu", "Punjab"), "Karnataka"),
            QuizQuestion("Rani Chennamma resisted the policy of:", listOf("Doctrine of Lapse", "Non-cooperation", "Divide and rule", "Salt law"), "Doctrine of Lapse"),
            QuizQuestion("Sangolli Rayanna is remembered as a:", listOf("Freedom fighter", "Governor", "Viceroy", "Trader"), "Freedom fighter")
        )

        "Social and Religious Reformation Movements" -> listOf(
            QuizQuestion("Brahmo Samaj was founded by:", listOf("Raja Ram Mohan Roy", "Dayananda Saraswati", "Vivekananda", "Gandhi"), "Raja Ram Mohan Roy"),
            QuizQuestion("Arya Samaj was founded by:", listOf("Dayananda Saraswati", "Raja Ram Mohan Roy", "Ambedkar", "Tilak"), "Dayananda Saraswati"),
            QuizQuestion("Ramakrishna Mission was founded by:", listOf("Swami Vivekananda", "Ramakrishna Paramahamsa", "Gandhi", "Nehru"), "Swami Vivekananda"),
            QuizQuestion("Jyotiba Phule worked for:", listOf("Social equality", "British expansion", "Doctrine of Lapse", "Trade monopoly"), "Social equality"),
            QuizQuestion("Social reform movements opposed:", listOf("Social evils", "Education", "Equality", "Science"), "Social evils")
        )

        "The First War of Indian Independence" -> listOf(
            QuizQuestion("The First War of Indian Independence happened in:", listOf("1857", "1757", "1942", "1885"), "1857"),
            QuizQuestion("A major cause of 1857 revolt was:", listOf("Greased cartridges", "Salt tax only", "Simon Commission", "Partition of Bengal only"), "Greased cartridges"),
            QuizQuestion("Mangal Pandey was associated with:", listOf("1857 revolt", "Quit India", "Dandi March", "Home Rule"), "1857 revolt"),
            QuizQuestion("Rani Lakshmi Bai ruled:", listOf("Jhansi", "Delhi", "Mysore", "Bengal"), "Jhansi"),
            QuizQuestion("Bahadur Shah Zafar was declared:", listOf("Leader of revolt", "British governor", "Viceroy", "Trader"), "Leader of revolt")
        )

        "Freedom Movement" -> listOf(
            QuizQuestion("Indian National Congress was founded in:", listOf("1885", "1857", "1905", "1947"), "1885"),
            QuizQuestion("Partition of Bengal took place in:", listOf("1905", "1919", "1930", "1942"), "1905"),
            QuizQuestion("Bal Gangadhar Tilak gave the slogan about:", listOf("Swaraj", "Quit India", "Jai Jawan", "Do or Die only"), "Swaraj"),
            QuizQuestion("Swadeshi movement promoted:", listOf("Indian goods", "Foreign goods", "British rule", "Doctrine of Lapse"), "Indian goods"),
            QuizQuestion("The national movement aimed at:", listOf("Independence", "More British control", "Ending education", "Stopping unity"), "Independence")
        )

        "Era of Gandhi and National Movement" -> listOf(
            QuizQuestion("Mahatma Gandhi returned to India from South Africa in:", listOf("1915", "1885", "1947", "1930"), "1915"),
            QuizQuestion("Non-Cooperation Movement started in:", listOf("1920", "1930", "1942", "1857"), "1920"),
            QuizQuestion("Dandi March was related to:", listOf("Salt law", "Forest law", "Education law", "Railway law"), "Salt law"),
            QuizQuestion("Quit India Movement started in:", listOf("1942", "1930", "1920", "1919"), "1942"),
            QuizQuestion("Gandhi's method of struggle was:", listOf("Satyagraha", "Doctrine of Lapse", "Subsidiary Alliance", "Imperialism"), "Satyagraha")
        )

        "Post Independent India" -> listOf(
            QuizQuestion("India became independent on:", listOf("15 August 1947", "26 January 1950", "2 October 1869", "14 November 1889"), "15 August 1947"),
            QuizQuestion("The Constitution of India came into force on:", listOf("26 January 1950", "15 August 1947", "2 October 1869", "30 January 1948"), "26 January 1950"),
            QuizQuestion("The first Prime Minister of India was:", listOf("Jawaharlal Nehru", "Mahatma Gandhi", "Sardar Patel", "B.R. Ambedkar"), "Jawaharlal Nehru"),
            QuizQuestion("Integration of princely states was led mainly by:", listOf("Sardar Vallabhbhai Patel", "Lord Mountbatten", "Tilak", "Subhash Chandra Bose"), "Sardar Vallabhbhai Patel"),
            QuizQuestion("India is a:", listOf("Democratic republic", "Monarchy", "Military rule", "Colony"), "Democratic republic")
        )

        "The Political Developments of 20th Century" -> listOf(
            QuizQuestion("The First World War began in:", listOf("1914", "1939", "1945", "1857"), "1914"),
            QuizQuestion("The Second World War ended in:", listOf("1945", "1914", "1939", "1950"), "1945"),
            QuizQuestion("The Russian Revolution took place in:", listOf("1917", "1947", "1789", "1857"), "1917"),
            QuizQuestion("The United Nations was founded in:", listOf("1945", "1919", "1930", "1955"), "1945"),
            QuizQuestion("Cold War was mainly between:", listOf("USA and USSR", "India and China", "Britain and France", "Japan and Korea"), "USA and USSR")
        )

        "Indian Foreign Policy" -> listOf(
            QuizQuestion("Indian foreign policy supports:", listOf("Peaceful coexistence", "Colonialism", "War only", "Isolation always"), "Peaceful coexistence"),
            QuizQuestion("Non-alignment means:", listOf("Not joining power blocs", "No relations with countries", "Joining only one bloc", "Only military rule"), "Not joining power blocs"),
            QuizQuestion("Panchsheel has how many principles?", listOf("5", "3", "7", "10"), "5"),
            QuizQuestion("India's foreign policy was strongly shaped by:", listOf("Jawaharlal Nehru", "Robert Clive", "Dalhousie", "Cornwallis"), "Jawaharlal Nehru"),
            QuizQuestion("Foreign policy deals with relations with:", listOf("Other countries", "Only villages", "Only schools", "Only banks"), "Other countries")
        )

        "India's Relationship with Other Countries" -> listOf(
            QuizQuestion("India shares a long border with:", listOf("China", "Brazil", "Canada", "Australia"), "China"),
            QuizQuestion("SAARC is related to cooperation in:", listOf("South Asia", "Europe", "Africa only", "America only"), "South Asia"),
            QuizQuestion("India and Nepal share:", listOf("Friendly relations and border", "No cultural contact", "Only sea border", "No trade"), "Friendly relations and border"),
            QuizQuestion("India's relations with other countries are based on:", listOf("Mutual cooperation", "Only conflict", "Colonial rule", "No diplomacy"), "Mutual cooperation"),
            QuizQuestion("Diplomacy is used to maintain:", listOf("International relations", "Only local markets", "Only exams", "Only sports"), "International relations")
        )

        "Global Problems and India's Role" -> listOf(
            QuizQuestion("A major global problem is:", listOf("Terrorism", "Only local festivals", "Only school exams", "Only agriculture"), "Terrorism"),
            QuizQuestion("Environmental pollution is a:", listOf("Global problem", "Only village issue", "No issue", "Only school issue"), "Global problem"),
            QuizQuestion("India supports world:", listOf("Peace", "War", "Colonialism", "Apartheid"), "Peace"),
            QuizQuestion("Disarmament means:", listOf("Reduction of weapons", "Increase of weapons", "More wars", "No peace talks"), "Reduction of weapons"),
            QuizQuestion("Climate change affects:", listOf("The whole world", "Only one city", "Only one family", "Nobody"), "The whole world")
        )

        "Indian Position and Extension" -> listOf(
            QuizQuestion("India is located in which continent?", listOf("Asia", "Europe", "Africa", "Australia"), "Asia"),
            QuizQuestion("The southernmost point of mainland India is:", listOf("Kanyakumari", "Delhi", "Mumbai", "Kolkata"), "Kanyakumari"),
            QuizQuestion("India lies mainly in the:", listOf("Northern Hemisphere", "Southern Hemisphere", "Western Hemisphere only", "Polar region"), "Northern Hemisphere"),
            QuizQuestion("The standard meridian of India is:", listOf("82°30'E", "0°", "23°30'N", "90°W"), "82°30'E"),
            QuizQuestion("India's time is ahead of GMT by:", listOf("5 hours 30 minutes", "2 hours", "10 hours", "1 hour"), "5 hours 30 minutes")
        )

        "Indian Physiography" -> listOf(
            QuizQuestion("The Himalayas are located in the:", listOf("North", "South", "East coast only", "West coast only"), "North"),
            QuizQuestion("The Northern Plains are formed mainly by:", listOf("River deposits", "Volcanoes", "Deserts", "Glaciers only"), "River deposits"),
            QuizQuestion("The Deccan Plateau is a:", listOf("Plateau", "Plain", "Island", "Delta only"), "Plateau"),
            QuizQuestion("Western Ghats are found along:", listOf("Western coast", "Eastern coast only", "Northern border", "Central plain only"), "Western coast"),
            QuizQuestion("The Thar Desert is located mainly in:", listOf("Rajasthan", "Kerala", "Assam", "Karnataka"), "Rajasthan")
        )

        "Indian Climate" -> listOf(
            QuizQuestion("India has mainly which type of climate?", listOf("Monsoon climate", "Polar climate", "Tundra climate", "Mediterranean only"), "Monsoon climate"),
            QuizQuestion("The main rainy season in India is due to:", listOf("Southwest monsoon", "Western disturbances only", "Cyclones only", "Trade fairs"), "Southwest monsoon"),
            QuizQuestion("The hottest season is generally:", listOf("Summer", "Winter", "Rainy", "Spring only"), "Summer"),
            QuizQuestion("Mawsynram/Cherrapunji region is known for:", listOf("Heavy rainfall", "No rain", "Snow desert", "Extreme dryness"), "Heavy rainfall"),
            QuizQuestion("Climate means average weather over:", listOf("Long period", "One minute", "One hour", "One day only"), "Long period")
        )

        "Indian Soils" -> listOf(
            QuizQuestion("Black soil is suitable for:", listOf("Cotton", "Tea only", "Rubber only", "Coconut only"), "Cotton"),
            QuizQuestion("Alluvial soil is found mainly in:", listOf("River plains", "Deserts only", "Mountains only", "Islands only"), "River plains"),
            QuizQuestion("Red soil gets colour due to:", listOf("Iron content", "Gold", "Silver", "Salt"), "Iron content"),
            QuizQuestion("Laterite soil is common in areas with:", listOf("Heavy rainfall", "No rainfall", "Only snow", "Only desert"), "Heavy rainfall"),
            QuizQuestion("Soil erosion means:", listOf("Removal of top soil", "Adding fertilizer", "Plant growth", "Rainfall only"), "Removal of top soil")
        )

        "Indian Forest Resources" -> listOf(
            QuizQuestion("Forests help in:", listOf("Maintaining ecological balance", "Increasing soil erosion", "Stopping oxygen", "Reducing rainfall always"), "Maintaining ecological balance"),
            QuizQuestion("Evergreen forests are found in areas of:", listOf("Heavy rainfall", "Very low rainfall", "Only deserts", "Polar regions"), "Heavy rainfall"),
            QuizQuestion("Teak and sal are found in:", listOf("Deciduous forests", "Tundra", "Desert", "Mangrove only"), "Deciduous forests"),
            QuizQuestion("Mangrove forests are found in:", listOf("Delta regions", "Dry deserts", "High snow peaks only", "Rocky moons"), "Delta regions"),
            QuizQuestion("Deforestation means:", listOf("Cutting forests", "Planting trees", "Protecting wildlife", "Rainwater harvesting"), "Cutting forests")
        )

        "Indian Water Resources" -> listOf(
            QuizQuestion("A major source of freshwater is:", listOf("Rivers", "Petrol", "Coal", "Iron ore"), "Rivers"),
            QuizQuestion("Dams are built mainly for:", listOf("Irrigation and power", "Only decoration", "Stopping all rivers", "Making roads only"), "Irrigation and power"),
            QuizQuestion("Rainwater harvesting means:", listOf("Collecting rainwater", "Wasting water", "Polluting rivers", "Removing tanks"), "Collecting rainwater"),
            QuizQuestion("The Ganga is a:", listOf("River", "Mountain", "Desert", "Forest"), "River"),
            QuizQuestion("Water conservation means:", listOf("Saving water", "Wasting water", "Polluting water", "Boiling water only"), "Saving water")
        )

        "Indian Transport and Communication" -> listOf(
            QuizQuestion("The cheapest transport for heavy goods over long distance is often:", listOf("Railways", "Airways", "Walking", "Bicycle only"), "Railways"),
            QuizQuestion("National highways connect:", listOf("Major cities", "Only houses", "Only schools", "Only farms"), "Major cities"),
            QuizQuestion("Air transport is the:", listOf("Fastest", "Slowest", "Cheapest always", "Oldest only"), "Fastest"),
            QuizQuestion("Communication includes:", listOf("Telephone and internet", "Only farming", "Only mining", "Only weaving"), "Telephone and internet"),
            QuizQuestion("Ports are used for:", listOf("Sea transport", "Air transport", "Road transport only", "Rail transport only"), "Sea transport")
        )

        "Development" -> listOf(
            QuizQuestion("Development means:", listOf("Improvement in quality of life", "Only more population", "Only pollution", "Only war"), "Improvement in quality of life"),
            QuizQuestion("HDI stands for:", listOf("Human Development Index", "High District Income", "Human Data India", "Heavy Development Idea"), "Human Development Index"),
            QuizQuestion("Literacy rate is related to:", listOf("Education", "Rainfall", "Mining", "Transport only"), "Education"),
            QuizQuestion("Per capita income means:", listOf("Average income per person", "Total rainfall", "Total forest", "Only tax amount"), "Average income per person"),
            QuizQuestion("A developed society should provide:", listOf("Education, health and income opportunities", "Only luxury", "Only taxes", "Only roads without people"), "Education, health and income opportunities")
        )

        "Money and Credit" -> listOf(
            QuizQuestion("Money acts as a:", listOf("Medium of exchange", "Only metal", "Only paper", "Only decoration"), "Medium of exchange"),
            QuizQuestion("Banks provide:", listOf("Loans", "Only forests", "Only roads", "Only rainfall"), "Loans"),
            QuizQuestion("Credit means:", listOf("Borrowed money to be repaid", "Free gift always", "Only coins", "No repayment"), "Borrowed money to be repaid"),
            QuizQuestion("Collateral is:", listOf("Security against loan", "A type of crop", "A festival", "A tax only"), "Security against loan"),
            QuizQuestion("Self-help groups mainly help people in:", listOf("Savings and credit", "Only sports", "Only exams", "Only transport"), "Savings and credit")
        )

        else -> emptyList()
    }
}


