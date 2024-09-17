package dev.enzo.quizztory;

public class MQuestionnaires {

    //This array holds a list of historical and general knowledge questions, covering a range of topics from ancient civilizations to modern history.
    public static String questions[] = {
            "Who was the first emperor of China?",
            "What was the main cause of the French Revolution?",
            "Who led the famous Salt March during the Indian independence movement?",
            "Which ancient civilization is credited with the invention of the wheel?",
            "The Treaty of Versailles, ending World War I, was signed in:",
            "Who was the leader of the Bolsheviks during the Russian Revolution?",
            "The Battle of Gettysburg was a significant engagement during which war?",
            "Which pharaoh is associated with the construction of the Great Sphinx of Giza?",
            "The Marshall Plan was designed to aid the economic recovery of which continent after World War II?",
            "Who is often referred to as the 'Iron Chancellor' and played a key role in the unification of Germany?",
            "The Opium Wars were fought between China and which European country?",
            "What event led to the start of the Korean War in 1950?",
            "Who is known for his 95 Theses, which sparked the Protestant Reformation?",
            "The Boxer Rebellion took place in which country?",
            "What ancient civilization built the city of Machu Picchu?",
            "The Battle of Saratoga is considered a turning point in which conflict?",
            "Who was the first woman to become the Prime Minister of a country?",
            "The Treaty of Brest-Litovsk ended the involvement of which country in World War I?",
            "The Monroe Doctrine was declared by which U.S. President?",
            "The Berlin Airlift occurred in response to the blockade of West Berlin by which country?"
    };

    //Providing multiple-choice options for each question in the questions array. It allows users to select the correct answer from a set of options.
    public static String[][] choices = {
            {"Qin Shi Huang", "Sun Tzu", "Confucius", "Emperor Wu"},
            {"Economic inequality", "Religious conflict", "Foreign invasion", "Monarch's extravagant lifestyle"},
            {"Jawaharlal Nehru", "Mahatma Gandhi", "Subhas Chandra Bose", "Sardar Patel"},
            {"Sumerians", "Egyptians", "Indus Valley Civilization", "Greeks"},
            {"1917", "1918", "1919", "1920"},
            {"Vladimir Lenin", "Joseph Stalin", "Leon Trotsky", "Mikhail Gorbachev"},
            {"American Revolutionary War", "Civil War", "World War I", "War of 1812"},
            {"Ramses II", "Khufu", "Hatshepsut", "Akhenaten"},
            {"Europe", "Asia", "Africa", "South America"},
            {"Otto von Bismarck", "Wilhelm II", "Frederick the Great", "Adolf Hitler"},
            {"Britain", "France", "Spain", "Portugal"},
            {"North Korean invasion of South Korea", "Japanese occupation of Korea", "Chinese intervention in Korean affairs", "U.S. bombing of North Korea"},
            {"Martin Luther", "John Calvin", "Henry VIII", "Pope Leo X"},
            {"Japan", "China", "India", "Korea"},
            {"Aztecs", "Incas", "Mayans", "Moche"},
            {"American Revolutionary War", "War of 1812", "Civil War", "World War I"},
            {"Margaret Thatcher", "Golda Meir", "Indira Gandhi", "Angela Merkel"},
            {"Germany", "Russia", "France", "Italy"},
            {"James Madison", "James Monroe", "John Adams", "Thomas Jefferson"},
            {"Soviet Union", "United States", "United Kingdom", "France"}
    };

    //Contains the correct answers corresponding to each question in the questions array. It serves as a reference for checking the accuracy of user responses.
    public static String[] answers = {
            "Qin Shi Huang",
            "Economic inequality",
            "Mahatma Gandhi",
            "Sumerians",
            "1919",
            "Vladimir Lenin",
            "Civil War",
            "Khufu",
            "Europe",
            "Otto von Bismarck",
            "Britain",
            "North Korean invasion of South Korea",
            "Martin Luther",
            "China",
            "Incas",
            "American Revolutionary War",
            "Indira Gandhi",
            "Russia",
            "James Monroe",
            "Soviet Union"
    };
}
