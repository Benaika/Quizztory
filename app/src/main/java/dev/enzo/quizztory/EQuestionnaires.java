package dev.enzo.quizztory;

public class EQuestionnaires {

    //This array holds a list of historical and general knowledge questions, covering a range of topics from ancient civilizations to modern history.
    public static String questions[] = {

            "Who was the first President of the United States?",
            "In which century did the Renaissance take place?",
            "What ancient wonder was located in Egypt and known for its tall structures?",
            "Who is famous for crossing the Alps with elephants during the Second Punic War?",
            "What event marked the beginning of World War I?",
            "Who is known as the \"Father of Computer Science\"?",
            "What ancient civilization built the pyramids in Giza?",
            "In which year did Christopher Columbus reach the Americas?",
            "Who was the leader of the Soviet Union during World War II?",
            "What is the Magna Carta, and why is it significant?",
            "Who wrote the play \"Romeo and Juliet\"?",
            "What ancient city was known for its hanging gardens?",
            "Who is credited with the invention of the printing press?",
            "What is the significance of the Declaration of Independence?",
            "Who was the first woman to win a Nobel Prize?",
            "What was the main purpose of the Great Wall of China?",
            "Which war was fought between the North and South regions of the United States in the 1860s?",
            "Who is known for discovering penicillin?",
            "What ancient civilization is associated with the city of Troy?",
            "In what year did the Berlin Wall fall, symbolizing the end of the Cold War?"

    };

    //Providing multiple-choice options for each question in the questions array. It allows users to select the correct answer from a set of options.
    public static String[][] choices = {
            {"Thomas Jefferson", "George Washington", "Abraham Lincoln", "John Adams"},
            {"15th century", "17th century", "19th century", "21st century"},
            {"Hanging Gardens of Babylon", "Colossus of Rhodes", "Statue of Zeus at Olympia", "Great Pyramid of Giza"},
            {"Julius Caesar", "Alexander the Great", "Hannibal", "Genghis Khan"},
            {"Pearl Harbor", "The sinking of the Lusitania", "The assassination of Archduke Franz Ferdinand", "The Battle of Normandy"},
            {"Alan Turing", "Bill Gates", "Steve Jobs", "Charles Babbage"},
            {"Mesopotamia", "Greece", "Egypt", "Rome"},
            {"1492", "1607", "1776", "1812"},
            {"Joseph Stalin", "Vladimir Lenin", "Nikita Khrushchev", "Mikhail Gorbachev"},
            {"A medieval cookbook", "An ancient map", "A legal document limiting the power of the monarch", "A religious text"},
            {"Charles Dickens", "William Shakespeare", "Jane Austen", "Mark Twain"},
            {"Athens", "Babylon", "Rome", "Alexandria"},
            {"Johannes Gutenberg", "Leonardo da Vinci", "Isaac Newton", "Galileo Galilei"},
            {"It established the first government of the United States", "It declared the end of World War II", "It proclaimed the independence of the American colonies from British rule", "It outlined the principles of the Industrial Revolution"},
            {"Marie Curie", "Amelia Earhart", "Florence Nightingale", "Rosa Parks"},
            {"To protect against invasions", "To serve as a trade route", "To provide irrigation", "To mark the border between China and Mongolia"},
            {"World War I", "American Revolutionary War", "Civil War", "War of 1812"},
            {"Alexander Fleming", "Louis Pasteur", "Joseph Lister", "Marie Curie"},
            {"Sumerians", "Egyptians", "Greeks", "Persians"},
            {"1989", "1971", "1963", "1995"}
    };

    //Contains the correct answers corresponding to each question in the questions array. It serves as a reference for checking the accuracy of user responses.
    public static String[] answers = {
            "George Washington",
            "15th century",
            "Great Pyramid of Giza",
            "Hannibal",
            "The assassination of Archduke Franz Ferdinand",
            "Alan Turing",
            "Egypt",
            "1492",
            "Joseph Stalin",
            "A legal document limiting the power of the monarch",
            "William Shakespeare",
            "Babylon",
            "Johannes Gutenberg",
            "It proclaimed the independence of the American colonies from British rule",
            "Marie Curie",
            "To protect against invasions",
            "Civil War",
            "Alexander Fleming",
            "Greeks",
            "1989"
    };
}
