package dev.enzo.quizztory;

public class HQuestionnaires {

    //This array holds a list of historical and general knowledge questions, covering a range of topics from ancient civilizations to modern history.
    public static String questions[] = {
            "Who was the Roman Emperor during the construction of the Colosseum?",
            "Which ancient Greek historian is known as the \"Father of History\"?",
            "The Battle of Gaugamela, a decisive battle in the conquest of Persia by Alexander the Great, took place in what present-day country?",
            "Who was the first President of the United States to be impeached?",
            "The Peloponnesian War was fought between which two ancient Greek city-states?",
            "Which medieval queen was known as the \"She-Wolf of France\" and was married to Edward II of England?",
            "The War of the Roses was a series of civil wars fought between the houses of:",
            "The Treaty of Tordesillas, signed in 1494, divided newly discovered lands between which two European powers?",
            "Who was the famous admiral during the Age of Exploration and the first to circumnavigate the Earth?",
            "The Battle of Cannae, a major confrontation during the Second Punic War, was fought between Rome and:",
            "The Magna Carta was signed in 1215 during the reign of which English king?",
            "Which ancient city was the capital of the powerful Assyrian Empire?",
            "The Treaty of Westphalia, ending the Thirty Years' War, was signed in:",
            "The Battle of Lepanto, a naval engagement in 1571, involved the Holy League fighting against the forces of:",
            "Who was the leader of the Haitian Revolution and the first ruler of an independent Haiti?",
            "The Partition of India in 1947 led to the creation of which two independent countries?",
            "The Battle of Plataea, a decisive conflict in the Greco-Persian Wars, took place in what year?",
            "The Treaty of Utrecht, signed in 1713, marked the end of which war?",
            "The Bayeux Tapestry depicts events leading up to and including which historical event?",
            "The term \"Glasnost\" was associated with the policies of which Soviet leader in the 1980s?"
    };

    //Providing multiple-choice options for each question in the questions array. It allows users to select the correct answer from a set of options.
    public static String[][] choices = {
            {"Julius Caesar", "Augustus", "Nero", "Trajan"},
            {"Herodotus", "Thucydides", "Xenophon", "Aristotle"},
            {"Iraq", "Iran", "Afghanistan", "Turkey"},
            {"Andrew Johnson", "Richard Nixon", "Bill Clinton", "Donald Trump"},
            {"Athens and Sparta", "Corinth and Thebes", "Delphi and Olympia", "Argos and Megara"},
            {"Eleanor of Aquitaine", "Isabella of France", "Catherine of Aragon", "Mary I of England"},
            {"York and Lancaster", "Tudor and Stuart", "Plantagenet and Habsburg", "Bourbon and Valois"},
            {"Spain and Portugal", "England and France", "Netherlands and Spain", "Italy and Austria"},
            {"Ferdinand Magellan", "Christopher Columbus", "Vasco da Gama", "Hernán Cortés"},
            {"Carthage", "Macedon", "Gaul", "Persia"},
            {"Henry II", "Richard the Lionheart", "John", "Edward I"},
            {"Babylon", "Nineveh", "Ur", "Eridu"},
            {"1618", "1648", "1685", "1721"},
            {"Ottoman Empire", "Spanish Empire", "British Empire", "French Empire"},
            {"Toussaint Louverture", "Jean-Jacques Dessalines", "Simon Bolivar", "Jose de San Martin"},
            {"India and Pakistan", "India and Bangladesh", "Pakistan and Afghanistan", "Sri Lanka and Nepal"},
            {"490 BC", "480 BC", "450 BC", "410 BC"},
            {"Spanish Succession", "Thirty Years' War", "Hundred Years' War", "War of the Roses"},
            {"Battle of Agincourt", "Battle of Hastings", "Battle of Cannae", "Siege of Orleans"},
            {"Joseph Stalin", "Nikita Khrushchev", "Leon Trotsky", "Mikhail Gorbachev"}
    };

    //Contains the correct answers corresponding to each question in the questions array. It serves as a reference for checking the accuracy of user responses.
    public static String[] answers = {
            "Nero",
            "Herodotus",
            "Iraq",
            "Andrew Johnson",
            "Athens and Sparta",
            "Isabella of France",
            "York and Lancaster",
            "Spain and Portugal",
            "Ferdinand Magellan",
            "Carthage",
            "John",
            "Nineveh",
            "1648",
            "Ottoman Empire",
            "Jean-Jacques Dessalines",
            "India and Pakistan",
            "480 BC",
            "Spanish Succession",
            "Battle of Hastings",
            "Mikhail Gorbachev"
    };
}
