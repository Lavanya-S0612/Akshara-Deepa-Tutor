package com.example.aksharadeepatutor.data

fun getMathQuizQuestions(chapterName: String): List<QuizQuestion> {
    return when (chapterName) {
        "Arithmetic Progressions" -> listOf(
            QuizQuestion("What is the nth term of an AP?", listOf("a + (n - 1)d", "a + nd", "n + d", "ad + n"), "a + (n - 1)d"),
            QuizQuestion("In an AP, d represents:", listOf("Common difference", "First term", "Last term", "Number of terms"), "Common difference"),
            QuizQuestion("If a = 2 and d = 3, the second term is:", listOf("5", "6", "3", "2"), "5"),
            QuizQuestion("The sequence 2, 4, 6, 8 is:", listOf("Arithmetic progression", "Geometric progression", "Not a sequence", "Quadratic equation"), "Arithmetic progression"),
            QuizQuestion("The sum of first n terms of AP is:", listOf("n/2[2a + (n - 1)d]", "a + d", "n + a + d", "ad/n"), "n/2[2a + (n - 1)d]")
        )

        "Triangles" -> listOf(
            QuizQuestion("Two triangles are similar if their corresponding angles are:", listOf("Equal", "Unequal", "Double", "Zero"), "Equal"),
            QuizQuestion("The theorem related to right triangles is:", listOf("Pythagoras theorem", "Remainder theorem", "Ohm's law", "Euclid division lemma"), "Pythagoras theorem"),
            QuizQuestion("In a right triangle, the longest side is called:", listOf("Hypotenuse", "Median", "Altitude", "Base only"), "Hypotenuse"),
            QuizQuestion("If two triangles have equal corresponding sides in ratio, they are:", listOf("Similar", "Always congruent", "Circles", "Parallel lines"), "Similar"),
            QuizQuestion("Pythagoras theorem is:", listOf("a^2 + b^2 = c^2", "a + b = c", "ab = c", "a^2 - b^2 = c"), "a^2 + b^2 = c^2")
        )

        "Pair of Linear Equations in Two Variables" -> listOf(
            QuizQuestion("A linear equation in two variables has form:", listOf("ax + by + c = 0", "ax^2 + bx + c = 0", "x^3 = 0", "xy^2 = 1"), "ax + by + c = 0"),
            QuizQuestion("The graph of a linear equation is a:", listOf("Straight line", "Circle", "Parabola", "Triangle"), "Straight line"),
            QuizQuestion("If two lines intersect, the equations have:", listOf("One solution", "No solution", "Infinite solutions", "Only zero solution"), "One solution"),
            QuizQuestion("If two lines are parallel, they have:", listOf("No solution", "One solution", "Two solutions", "Infinite solutions"), "No solution"),
            QuizQuestion("The substitution method is used to:", listOf("Solve equations", "Draw circles only", "Find area only", "Measure angle only"), "Solve equations")
        )

        "Circles" -> listOf(
            QuizQuestion("A line touching a circle at one point is:", listOf("Tangent", "Secant", "Chord", "Diameter"), "Tangent"),
            QuizQuestion("A tangent to a circle is perpendicular to the radius at:", listOf("Point of contact", "Centre", "Any point", "Diameter"), "Point of contact"),
            QuizQuestion("Number of tangents from an external point to a circle is:", listOf("2", "1", "0", "4"), "2"),
            QuizQuestion("A chord passing through the centre is:", listOf("Diameter", "Radius", "Tangent", "Arc"), "Diameter"),
            QuizQuestion("The distance from centre to any point on circle is:", listOf("Radius", "Diameter", "Chord", "Secant"), "Radius")
        )

        "Areas Related to Circles" -> listOf(
            QuizQuestion("Area of a circle is:", listOf("pi r^2", "2 pi r", "pi d", "r^2"), "pi r^2"),
            QuizQuestion("Circumference of a circle is:", listOf("2 pi r", "pi r^2", "l b", "4a"), "2 pi r"),
            QuizQuestion("Diameter is equal to:", listOf("2r", "r/2", "r^2", "pi r"), "2r"),
            QuizQuestion("A part of circle bounded by two radii and an arc is:", listOf("Sector", "Triangle", "Rectangle", "Chord"), "Sector"),
            QuizQuestion("A part of circle bounded by chord and arc is:", listOf("Segment", "Sector", "Radius", "Diameter"), "Segment")
        )

        "Constructions" -> listOf(
            QuizQuestion("Which tool is used to draw a circle?", listOf("Compass", "Protractor", "Scale only", "Divider only"), "Compass"),
            QuizQuestion("Which tool is used to measure angles?", listOf("Protractor", "Compass", "Eraser", "Pencil only"), "Protractor"),
            QuizQuestion("Construction should be done using:", listOf("Scale and compass", "Calculator only", "Pen only", "Keyboard"), "Scale and compass"),
            QuizQuestion("To draw a perpendicular bisector, we mainly use:", listOf("Compass", "Calculator", "Marker", "Thread only"), "Compass"),
            QuizQuestion("A tangent can be constructed to a circle from:", listOf("External point", "Only centre", "Only radius", "Only chord"), "External point")
        )

        "Coordinate Geometry" -> listOf(
            QuizQuestion("The x-axis and y-axis meet at:", listOf("Origin", "Quadrant", "Point P", "Line segment"), "Origin"),
            QuizQuestion("Coordinates of origin are:", listOf("(0,0)", "(1,0)", "(0,1)", "(1,1)"), "(0,0)"),
            QuizQuestion("Distance formula is used to find:", listOf("Distance between two points", "Area of circle", "Volume", "Angle only"), "Distance between two points"),
            QuizQuestion("A point on x-axis has y-coordinate:", listOf("0", "1", "-1", "Any fixed 2"), "0"),
            QuizQuestion("The coordinate plane has how many quadrants?", listOf("4", "2", "3", "1"), "4")
        )

        "Real Numbers" -> listOf(
            QuizQuestion("HCF means:", listOf("Highest Common Factor", "High Common Formula", "Highest Common Fraction", "Half Common Factor"), "Highest Common Factor"),
            QuizQuestion("LCM means:", listOf("Least Common Multiple", "Large Common Method", "Lowest Common Minus", "Linear Common Multiple"), "Least Common Multiple"),
            QuizQuestion("Euclid's division lemma is:", listOf("a = bq + r", "a + b = r", "a = b + q", "ab = qr"), "a = bq + r"),
            QuizQuestion("A number divisible only by 1 and itself is:", listOf("Prime number", "Composite number", "Even number always", "Decimal"), "Prime number"),
            QuizQuestion("The HCF of 12 and 18 is:", listOf("6", "12", "18", "3"), "6")
        )

        "Polynomials" -> listOf(
            QuizQuestion("A polynomial of degree 2 is called:", listOf("Quadratic polynomial", "Linear polynomial", "Cubic polynomial", "Constant polynomial"), "Quadratic polynomial"),
            QuizQuestion("A polynomial of degree 1 is called:", listOf("Linear polynomial", "Quadratic polynomial", "Cubic polynomial", "Zero polynomial"), "Linear polynomial"),
            QuizQuestion("The zeros of a polynomial are the values where polynomial becomes:", listOf("0", "1", "-1", "Undefined always"), "0"),
            QuizQuestion("Degree of x^3 + 2x + 1 is:", listOf("3", "2", "1", "0"), "3"),
            QuizQuestion("For quadratic ax^2 + bx + c, sum of zeros is:", listOf("-b/a", "c/a", "b/a", "-c/a"), "-b/a")
        )

        "Quadratic Equations" -> listOf(
            QuizQuestion("Standard form of quadratic equation is:", listOf("ax^2 + bx + c = 0", "ax + b = 0", "x^3 + c = 0", "a + b + c = 0"), "ax^2 + bx + c = 0"),
            QuizQuestion("A quadratic equation has highest power:", listOf("2", "1", "3", "0"), "2"),
            QuizQuestion("The formula for roots is:", listOf("(-b ± sqrt(b^2 - 4ac))/2a", "b/a", "c/a", "a/b"), "(-b ± sqrt(b^2 - 4ac))/2a"),
            QuizQuestion("The discriminant is:", listOf("b^2 - 4ac", "a^2 - 4bc", "2ab", "abc"), "b^2 - 4ac"),
            QuizQuestion("If discriminant is zero, roots are:", listOf("Equal", "Imaginary only", "No roots", "Three roots"), "Equal")
        )

        "Introduction to Trigonometry" -> listOf(
            QuizQuestion("sin theta is:", listOf("Opposite/Hypotenuse", "Adjacent/Hypotenuse", "Opposite/Adjacent", "Hypotenuse/Opposite"), "Opposite/Hypotenuse"),
            QuizQuestion("cos theta is:", listOf("Adjacent/Hypotenuse", "Opposite/Hypotenuse", "Opposite/Adjacent", "Hypotenuse/Adjacent"), "Adjacent/Hypotenuse"),
            QuizQuestion("tan theta is:", listOf("Opposite/Adjacent", "Adjacent/Opposite", "Hypotenuse/Opposite", "Adjacent/Hypotenuse"), "Opposite/Adjacent"),
            QuizQuestion("sin 30° is:", listOf("1/2", "1", "0", "sqrt(3)/2"), "1/2"),
            QuizQuestion("cos 0° is:", listOf("1", "0", "1/2", "sqrt(3)/2"), "1")
        )

        "Some Applications of Trigonometry" -> listOf(
            QuizQuestion("Trigonometry is used to find:", listOf("Heights and distances", "Only time", "Only mass", "Only temperature"), "Heights and distances"),
            QuizQuestion("Angle of elevation is measured when object is:", listOf("Above horizontal line", "Below horizontal line", "Behind observer", "At origin only"), "Above horizontal line"),
            QuizQuestion("Angle of depression is measured when object is:", listOf("Below horizontal line", "Above horizontal line", "At same level only", "Inside triangle only"), "Below horizontal line"),
            QuizQuestion("A line from observer's eye to object is called:", listOf("Line of sight", "Radius", "Median", "Chord"), "Line of sight"),
            QuizQuestion("Which ratio is commonly used for height problems?", listOf("tan theta", "Only pi", "Only area", "Only volume"), "tan theta")
        )

        "Statistics" -> listOf(
            QuizQuestion("Mean is also called:", listOf("Average", "Median", "Mode", "Range"), "Average"),
            QuizQuestion("Median is the:", listOf("Middle value", "Most repeated value", "Highest value", "Lowest value"), "Middle value"),
            QuizQuestion("Mode is the value that occurs:", listOf("Most frequently", "Least frequently", "Only once", "Never"), "Most frequently"),
            QuizQuestion("Range is:", listOf("Highest value - lowest value", "Mean + median", "Mode - mean", "Total/n"), "Highest value - lowest value"),
            QuizQuestion("Statistics deals with:", listOf("Collection and analysis of data", "Only triangles", "Only circles", "Only equations"), "Collection and analysis of data")
        )

        "Probability" -> listOf(
            QuizQuestion("Probability of a sure event is:", listOf("1", "0", "2", "-1"), "1"),
            QuizQuestion("Probability of an impossible event is:", listOf("0", "1", "2", "-1"), "0"),
            QuizQuestion("Probability value lies between:", listOf("0 and 1", "1 and 2", "-1 and 0", "2 and 10"), "0 and 1"),
            QuizQuestion("When a coin is tossed, possible outcomes are:", listOf("Head and Tail", "Only Head", "Only Tail", "1 and 2"), "Head and Tail"),
            QuizQuestion("Probability = favourable outcomes divided by:", listOf("Total outcomes", "Only impossible outcomes", "Mean", "Median"), "Total outcomes")
        )

        "Surface Areas and Volumes" -> listOf(
            QuizQuestion("Volume of a cube is:", listOf("a^3", "a^2", "4a", "6a^2"), "a^3"),
            QuizQuestion("Surface area of a cube is:", listOf("6a^2", "a^3", "2 pi r", "pi r^2"), "6a^2"),
            QuizQuestion("Volume of a cylinder is:", listOf("pi r^2 h", "2 pi r", "4/3 pi r^3", "l b h"), "pi r^2 h"),
            QuizQuestion("A cone has:", listOf("One circular base", "Two circular bases", "No base", "Four square bases"), "One circular base"),
            QuizQuestion("Volume of a sphere is:", listOf("4/3 pi r^3", "pi r^2 h", "a^3", "2 pi r h"), "4/3 pi r^3")
        )

        else -> emptyList()
    }
}

