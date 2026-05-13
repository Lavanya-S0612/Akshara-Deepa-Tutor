package com.example.aksharadeepatutor.data

fun getChaptersForSubject(subjectName: String): List<String> {
    return when (subjectName) {
        "Science" -> listOf(
            "Chemical Reactions and Equations",
            "Acids, Bases and Salts",
            "Metals and Non-metals",
            "Life Processes",
            "Control and Coordination",
            "Electricity",
            "Magnetic Effects of Electric Current",
            "Our Environment",
            "Carbon and Its Compounds",
            "Periodic Classification of Elements",
            "How Do Organisms Reproduce?",
            "Heredity and Evolution",
            "Light - Reflection and Refraction",
            "The Human Eye and the Colourful World",
            "Sources of Energy",
            "Sustainable Management of Natural Resources"
        )

        "Mathematics" -> listOf(
            "Arithmetic Progressions",
            "Triangles",
            "Pair of Linear Equations in Two Variables",
            "Circles",
            "Areas Related to Circles",
            "Constructions",
            "Coordinate Geometry",
            "Real Numbers",
            "Polynomials",
            "Quadratic Equations",
            "Introduction to Trigonometry",
            "Some Applications of Trigonometry",
            "Statistics",
            "Probability",
            "Surface Areas and Volumes"
        )

        else -> listOf(
            "Advent of Europeans to India",
            "The Extension of the British Rule",
            "The Impact of British Rule in India",
            "Opposition to British Rule in Karnataka",
            "Social and Religious Reformation Movements",
            "The First War of Indian Independence",
            "Freedom Movement",
            "Era of Gandhi and National Movement",
            "Post Independent India",
            "The Political Developments of 20th Century",
            "Indian Foreign Policy",
            "India's Relationship with Other Countries",
            "Global Problems and India's Role",
            "Indian Position and Extension",
            "Indian Physiography",
            "Indian Climate",
            "Indian Soils",
            "Indian Forest Resources",
            "Indian Water Resources",
            "Indian Transport and Communication",
            "Development",
            "Money and Credit"
        )
    }
}



