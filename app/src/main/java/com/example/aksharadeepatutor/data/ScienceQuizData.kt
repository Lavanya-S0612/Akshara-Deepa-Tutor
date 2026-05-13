package com.example.aksharadeepatutor.data

fun getScienceQuizQuestions(chapterName: String): List<QuizQuestion> {
    return when (chapterName) {
        "Chemical Reactions and Equations" -> listOf(
            QuizQuestion("Which type of reaction is burning of magnesium ribbon?", listOf("Combination reaction", "Decomposition reaction", "Displacement reaction", "Neutralization reaction"), "Combination reaction"),
            QuizQuestion("Which gas is released when zinc reacts with dilute hydrochloric acid?", listOf("Oxygen", "Hydrogen", "Carbon dioxide", "Nitrogen"), "Hydrogen"),
            QuizQuestion("What is the colour of copper sulphate solution?", listOf("Blue", "Green", "Yellow", "Red"), "Blue"),
            QuizQuestion("Rusting of iron is mainly an example of:", listOf("Oxidation", "Reduction", "Evaporation", "Condensation"), "Oxidation"),
            QuizQuestion("Which equation is balanced?", listOf("2H2 + O2 -> 2H2O", "H2 + O2 -> H2O", "H + O -> H2O", "2H + O2 -> H2O"), "2H2 + O2 -> 2H2O")
        )

        "Acids, Bases and Salts" -> listOf(
            QuizQuestion("Which acid is present in lemon juice?", listOf("Citric acid", "Acetic acid", "Hydrochloric acid", "Sulphuric acid"), "Citric acid"),
            QuizQuestion("What is the pH value of a neutral solution?", listOf("0", "7", "10", "14"), "7"),
            QuizQuestion("Which substance turns red litmus blue?", listOf("Acid", "Base", "Salt", "Water"), "Base"),
            QuizQuestion("Common salt is chemically known as:", listOf("Sodium chloride", "Calcium carbonate", "Sodium bicarbonate", "Potassium nitrate"), "Sodium chloride"),
            QuizQuestion("Which gas is released when acids react with metal carbonates?", listOf("Hydrogen", "Oxygen", "Carbon dioxide", "Nitrogen"), "Carbon dioxide")
        )

        "Metals and Non-metals" -> listOf(
            QuizQuestion("Which metal is liquid at room temperature?", listOf("Mercury", "Iron", "Copper", "Aluminium"), "Mercury"),
            QuizQuestion("Which property allows metals to be drawn into wires?", listOf("Ductility", "Malleability", "Brittleness", "Sonority"), "Ductility"),
            QuizQuestion("Which non-metal conducts electricity?", listOf("Graphite", "Sulphur", "Phosphorus", "Iodine"), "Graphite"),
            QuizQuestion("What is formed when metals react with oxygen?", listOf("Metal oxides", "Metal carbonates", "Metal chlorides", "Metal sulphides"), "Metal oxides"),
            QuizQuestion("Which metal is stored in kerosene?", listOf("Sodium", "Copper", "Gold", "Silver"), "Sodium")
        )

        "Life Processes" -> listOf(
            QuizQuestion("Which process helps green plants prepare food?", listOf("Photosynthesis", "Respiration", "Digestion", "Excretion"), "Photosynthesis"),
            QuizQuestion("Which gas is released during photosynthesis?", listOf("Oxygen", "Carbon dioxide", "Nitrogen", "Hydrogen"), "Oxygen"),
            QuizQuestion("Which organ pumps blood in humans?", listOf("Heart", "Lungs", "Brain", "Kidney"), "Heart"),
            QuizQuestion("The functional unit of kidney is:", listOf("Neuron", "Nephron", "Alveoli", "Villus"), "Nephron"),
            QuizQuestion("Where does digestion begin in humans?", listOf("Mouth", "Stomach", "Small intestine", "Large intestine"), "Mouth")
        )

        "Control and Coordination" -> listOf(
            QuizQuestion("Which system controls body activities quickly?", listOf("Nervous system", "Digestive system", "Respiratory system", "Excretory system"), "Nervous system"),
            QuizQuestion("The structural unit of nervous system is:", listOf("Neuron", "Nephron", "Hormone", "Enzyme"), "Neuron"),
            QuizQuestion("Which hormone is secreted by the pancreas?", listOf("Insulin", "Thyroxine", "Adrenaline", "Estrogen"), "Insulin"),
            QuizQuestion("Which part of the brain controls balance?", listOf("Cerebellum", "Cerebrum", "Medulla", "Spinal cord"), "Cerebellum"),
            QuizQuestion("Plant movement towards light is called:", listOf("Phototropism", "Geotropism", "Chemotropism", "Hydrotropism"), "Phototropism")
        )

        "Electricity" -> listOf(
            QuizQuestion("SI unit of electric current is:", listOf("Ampere", "Volt", "Ohm", "Watt"), "Ampere"),
            QuizQuestion("SI unit of resistance is:", listOf("Ohm", "Volt", "Ampere", "Joule"), "Ohm"),
            QuizQuestion("Which device measures electric current?", listOf("Ammeter", "Voltmeter", "Barometer", "Thermometer"), "Ammeter"),
            QuizQuestion("Ohm's law is:", listOf("V = IR", "P = VI", "R = VI", "I = VR"), "V = IR"),
            QuizQuestion("A good conductor of electricity is:", listOf("Copper", "Rubber", "Plastic", "Wood"), "Copper")
        )

        "Magnetic Effects of Electric Current" -> listOf(
            QuizQuestion("A current-carrying wire produces:", listOf("Magnetic field", "Sound", "Light only", "Heat only"), "Magnetic field"),
            QuizQuestion("Which device converts electrical energy into mechanical energy?", listOf("Electric motor", "Electric bulb", "Fuse", "Battery"), "Electric motor"),
            QuizQuestion("Which rule gives direction of magnetic field around a wire?", listOf("Right-hand thumb rule", "Newton's law", "Ohm's law", "Pascal's law"), "Right-hand thumb rule"),
            QuizQuestion("The core of an electromagnet is usually made of:", listOf("Soft iron", "Plastic", "Wood", "Glass"), "Soft iron"),
            QuizQuestion("Fuse wire protects a circuit from:", listOf("Overloading", "Cooling", "Low light", "Evaporation"), "Overloading")
        )

        "Our Environment" -> listOf(
            QuizQuestion("Which of these is biodegradable?", listOf("Paper", "Plastic", "Glass", "Metal can"), "Paper"),
            QuizQuestion("Green plants are called:", listOf("Producers", "Consumers", "Decomposers", "Predators"), "Producers"),
            QuizQuestion("The flow of energy in an ecosystem is:", listOf("One direction", "Two directions", "Circular", "Random only"), "One direction"),
            QuizQuestion("Which gas damages the ozone layer?", listOf("CFC", "Oxygen", "Nitrogen", "Hydrogen"), "CFC"),
            QuizQuestion("Organisms that break down dead matter are:", listOf("Decomposers", "Producers", "Herbivores", "Carnivores"), "Decomposers")
        )

        "Carbon and Its Compounds" -> listOf(
            QuizQuestion("Carbon has valency:", listOf("4", "1", "2", "8"), "4"),
            QuizQuestion("The ability of carbon to form long chains is called:", listOf("Catenation", "Combustion", "Oxidation", "Reduction"), "Catenation"),
            QuizQuestion("Which compound is used as fuel?", listOf("Methane", "Water", "Sodium chloride", "Calcium carbonate"), "Methane"),
            QuizQuestion("Ethanol is commonly known as:", listOf("Alcohol", "Vinegar", "Baking soda", "Lime water"), "Alcohol"),
            QuizQuestion("Soap removes dirt by forming:", listOf("Micelles", "Crystals", "Salts", "Metals"), "Micelles")
        )

        "Periodic Classification of Elements" -> listOf(
            QuizQuestion("Modern periodic table is based on:", listOf("Atomic number", "Atomic mass only", "Density", "Colour"), "Atomic number"),
            QuizQuestion("Elements in the same group have similar:", listOf("Valence electrons", "Atomic size only", "Mass only", "Colour"), "Valence electrons"),
            QuizQuestion("Who proposed the periodic law based on atomic mass?", listOf("Mendeleev", "Newton", "Einstein", "Rutherford"), "Mendeleev"),
            QuizQuestion("Across a period, metallic character generally:", listOf("Decreases", "Increases", "Remains same", "Becomes zero always"), "Decreases"),
            QuizQuestion("Noble gases are placed in:", listOf("Group 18", "Group 1", "Group 2", "Group 17"), "Group 18")
        )

        "How Do Organisms Reproduce?" -> listOf(
            QuizQuestion("Asexual reproduction involves:", listOf("One parent", "Two parents", "Only seeds", "Only flowers"), "One parent"),
            QuizQuestion("Binary fission is seen in:", listOf("Amoeba", "Human", "Mango plant", "Frog"), "Amoeba"),
            QuizQuestion("Male reproductive cell is called:", listOf("Sperm", "Ovum", "Zygote", "Embryo"), "Sperm"),
            QuizQuestion("Female reproductive cell is called:", listOf("Ovum", "Sperm", "Pollen", "Embryo"), "Ovum"),
            QuizQuestion("Fusion of male and female gametes is called:", listOf("Fertilization", "Pollination", "Germination", "Fragmentation"), "Fertilization")
        )

        "Heredity and Evolution" -> listOf(
            QuizQuestion("The basic unit of heredity is:", listOf("Gene", "Cell wall", "Tissue", "Organ"), "Gene"),
            QuizQuestion("Who is known as the father of genetics?", listOf("Gregor Mendel", "Darwin", "Newton", "Pasteur"), "Gregor Mendel"),
            QuizQuestion("Traits are transferred from parents to offspring through:", listOf("Genes", "Blood group only", "Food", "Air"), "Genes"),
            QuizQuestion("Evolution means:", listOf("Gradual change in organisms over generations", "Sudden growth only", "Digestion", "Respiration"), "Gradual change in organisms over generations"),
            QuizQuestion("Natural selection was explained by:", listOf("Charles Darwin", "Mendeleev", "Rutherford", "Faraday"), "Charles Darwin")
        )

        "Light - Reflection and Refraction" -> listOf(
            QuizQuestion("Bouncing back of light is called:", listOf("Reflection", "Refraction", "Dispersion", "Absorption"), "Reflection"),
            QuizQuestion("Bending of light when it passes from one medium to another is:", listOf("Refraction", "Reflection", "Scattering", "Evaporation"), "Refraction"),
            QuizQuestion("The mirror used by dentists is usually:", listOf("Concave mirror", "Plane mirror", "Convex mirror", "None"), "Concave mirror"),
            QuizQuestion("SI unit of power of lens is:", listOf("Dioptre", "Metre", "Watt", "Joule"), "Dioptre"),
            QuizQuestion("A convex lens is also called:", listOf("Converging lens", "Diverging lens", "Plane lens", "Opaque lens"), "Converging lens")
        )

        "The Human Eye and the Colourful World" -> listOf(
            QuizQuestion("The image is formed on which part of the eye?", listOf("Retina", "Cornea", "Iris", "Pupil"), "Retina"),
            QuizQuestion("The coloured part of the eye is:", listOf("Iris", "Retina", "Lens", "Cornea"), "Iris"),
            QuizQuestion("Defect of distant vision is called:", listOf("Myopia", "Hypermetropia", "Presbyopia", "Cataract"), "Myopia"),
            QuizQuestion("Splitting of white light into colours is:", listOf("Dispersion", "Reflection", "Refraction only", "Evaporation"), "Dispersion"),
            QuizQuestion("The sky appears blue due to:", listOf("Scattering of light", "Reflection only", "Absorption only", "No reason"), "Scattering of light")
        )

        "Sources of Energy" -> listOf(
            QuizQuestion("A renewable source of energy is:", listOf("Solar energy", "Coal", "Petroleum", "Natural gas"), "Solar energy"),
            QuizQuestion("Fossil fuels include:", listOf("Coal and petroleum", "Sunlight and wind", "Water and air", "Soil and rocks"), "Coal and petroleum"),
            QuizQuestion("Energy from the sun is called:", listOf("Solar energy", "Nuclear energy", "Thermal pollution", "Chemical energy"), "Solar energy"),
            QuizQuestion("Biogas mainly contains:", listOf("Methane", "Oxygen", "Nitrogen", "Hydrogen chloride"), "Methane"),
            QuizQuestion("A major disadvantage of fossil fuels is:", listOf("Pollution", "No heat", "No availability", "No carbon"), "Pollution")
        )

        "Sustainable Management of Natural Resources" -> listOf(
            QuizQuestion("The three Rs are reduce, reuse and:", listOf("Recycle", "Remove", "Restart", "Reject"), "Recycle"),
            QuizQuestion("Forests are important because they:", listOf("Maintain ecological balance", "Increase pollution", "Stop rainfall", "Destroy soil"), "Maintain ecological balance"),
            QuizQuestion("Rainwater harvesting helps in:", listOf("Water conservation", "Air pollution", "Noise pollution", "Deforestation"), "Water conservation"),
            QuizQuestion("Natural resources should be used:", listOf("Judiciously", "Wastefully", "Only once", "Without planning"), "Judiciously"),
            QuizQuestion("Chipko movement is related to protection of:", listOf("Forests", "Water tanks", "Factories", "Roads"), "Forests")
        )

        else -> emptyList()
    }
}
