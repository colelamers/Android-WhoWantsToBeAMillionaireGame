package whowantstobemillionaire;

import java.util.Arrays;
import java.util.List;

public class WWTBAM_Object {
	
	List<String> questionList;
	List<String[]> answersList;
	List<Integer> correctAnswers;
	
    public WWTBAM_Object(){
    	
    	String[] rQ1 = {"Athens", "Prague", "Rome", "Vienna"};
    	String[] rQ2 = {"A nerve in the brain", "A multi-axled vehicle", "A type of mortice lock", "A species of salamander"};
    	String[] rQ3 = {"Calvin Coolidge", "Herbert Hoover", "Theodore Roosevelt", "Woodrow Wilson"};
    	String[] rQ4 = {"Carmen", "Tosca", "Madame Butterfly", "La Boheme"};
    	String[] rQ5 = {"Enoch", "Jubal", "Lamech", "Zillah"};
    	String[] rQ6 = {"Antelope", "Bird", "Jewish settlement", "Climbing plant"};
    	String[] rQ7 = {"Campbell", "MacGregor", "MacLeod", "MacDonald"};
    	String[] rQ8 = {"Ecuador", "Peru", "Portugal", "Spain"};
    	String[] rQ9 = {"Detroit", "Toledo", "Cleveland", "Buffalo"};
    	String[] rQ10 = {"Seine", "Duoro", "Rio Grande", "Tagus"};
    	String[] rQ11 = {"Loire", "Seine", "Rhone", "Gironde"};
    	String[] rQ12 = {"Queensland", "Western Australia", "Northern Territory", "Tasmania"};
    	String[] rQ13 = {"Three: Milan, Naples and Turin", "Two: Genoa and Venice", "One:Ancona", "Four:Florence, Bologna, Trieste and Palermo"};
    	String[] rQ14 = {"Florida", "Louisiana", "Alabama", "South Carolina"};
    	String[] rQ15 = {"Atlantic", "Pacific", "Indian", "Arctic"};
    	String[] rQ16 = {"Boston", "Chicago", "St. Louis", "San Francisco"};
    	String[] rQ17 = {"Copper", "Lead", "Zinc", "Iron"};
    	String[] rQ18 = {"Virgo", "Taurus", "Aries", "Capricorn"};
    	String[] rQ19 = {"Venus", "Mercury", "Mars", "Saturn"};
    	String[] rQ20 = {"Fire", "Water", "Air", "Earth"};
    	String[] rQ21 = {"Pisces", "Capricorn", "Taurus", "Aries"};
    	String[] rQ22 = {"Aries", "Cancer", "Capricorn", "Leo"};
    	String[] rQ23 = {"Pluto", "Venus", "Earth", "Saturn"};
    	String[] rQ24 = {"Aquarius", "Sagittarius", "Cancer", "Leo"};
    	String[] rQ25 = {"Equestrian", "Tennis", "Sprinting", "Figure skating"};
    	String[] rQ26 = {"Dick Fosbury", "Mick Cadbury", "Nick Fosdyke", "Vic Foster"};
    	String[] rQ27 = {"British", "Canadian", "Irish", "Australian"};
    	String[] rQ28 = {"Gary Player", "Tiger Woods", "Jack Nicklaus", "Peter Allis"};
    	String[] rQ29 = {"Steffi Graf", "Chris Evert", "Evonne Cawley", "Kim Clijsters"};
    	String[] rQ30 = {"Juan Manuel Fangio", "Alberto Ascari", "Giuseppe Farina", "Jose Gonzales"};
    	String[] rQ31 = {"Giovanni Forte", "Diego Dettori", "Uto Viaggi", "Frankie Dettori"};
    	String[] rQ32 = {"Chicago Bears", "New York Yankees", "Baltimore Batters", "Cleveland Steelers"};
    	String[] rQ33 = {"Blue", "Green", "Hard", "Mouldy"};
    	String[] rQ34 = {"Cruel", "Oats", "Sugar", "Whisky"};
    	String[] rQ35 = {"Cheese", "Noodles", "A type of potato", "Soup"};
    	String[] rQ36 = {"Brown sauce", "HP sauce", "Ketchup", "Piccalilli"};
    	String[] rQ37 = {"Colourless", "Blue", "Green", "Yellow"};
    	String[] rQ38 = {"Banana", "Apple", "Carrot", "Pear"};
    	String[] rQ39 = {"Almonds", "Chestnuts", "Hazelnuts", "Walnuts"};
    	String[] rQ40 = {"Bacon", "Deep-fried Mars Bars", "Ribs", "Sausage"};
    	String[] rQ41 = {"Elizabeth II", "Edward VI", "Edward VII", "George VII"};
    	String[] rQ42 = {"Bosworth Field", "Barnet", "Hastings", "York"};
    	String[] rQ43 = {"Clive", "George VI", "Prince Louis of Battenburg", "Lord Louis Mountbatten"};
    	String[] rQ44 = {"Henry II", "Henry IV", "Henry VI", "Henry VIII"};
    	String[] rQ45 = {"Anne of Cleves", "Catherine of Aragon", "Catherine Howard", "Catherine Parr"};
    	String[] rQ46 = {"France", "Ireland", "Spain", "Wales"};
    	String[] rQ47 = {"George IV", "George III", "George II", "George I"};
    	String[] rQ48 = {"Robert Baden-Powell", "Colonel B. T. Mahon", "Fieldmarshal Bernard Montgomery", "Louis Mountbatten"};
    	String[] rQ49 = {"Charles", "Edward", "George", "Henry"};
    	String[] rQ50 = {"Big George", "Farmer Giles", "Farmer George", "Happy George"};
    	
    	List<String[]> answers = Arrays.asList(
    			rQ1,rQ2,rQ3,rQ4,rQ5,rQ6,rQ7,rQ8,rQ9,rQ10,
    			rQ11,rQ12,rQ13,rQ14,rQ15,rQ16,rQ17,rQ18,rQ19,rQ20,
    			rQ21,rQ22,rQ23,rQ24,rQ25,rQ26,rQ27,rQ28,rQ29,rQ30,
    			rQ31,rQ32,rQ33,rQ34,rQ35,rQ36,rQ37,rQ38,rQ39,rQ40,
    			rQ41,rQ42,rQ43,rQ44,rQ45,rQ46,rQ47,rQ48,rQ49,rQ50
    			);
    	
    	this.answersList = answers;
    	
    	List<String> questions = Arrays.asList(
    			"The Plaka is the oldest quarter of which city?",
    					"What is an axolotl?",
    					"The Panama Canal was officially opened by which US president?",
    					"In which opera did Maria Callas make her last appearance at Covent Garden?",
    					"After Adam, Eve, Cain and Abel who is the next person mentioned in the Bible?",
    					"What is a kudzu?",
    					"Outlawed from 1603 to 1774, which Scottish clan was known as the ‘Faceless Clan’?",
    					"From which country does tennis player Andres Gomez, winner of the 1990 French Championships, come?",
    					"Which US city is located on the Maumee River at Lake Erie?",
    					"Lisbon stands at the mouth of which river?",
    					"What is the longest river in France?",
    					"In which Australian state is Darwin?",
    					"Apart from Rome, how many cities in Italy have a population of over one million?",
    					"What in America is the Palmetto state?",
    					"In which ocean is Madagascar?",
    					"In which US city is the Sears Tower?",
    					"Galena is an ore of which metal?",
    					"Which sign of the zodiac comes between Leo and Libra?",
    					"Which planet is said to influence the way we communicate?",
    					"Are you a fire, air, water or earth sign if you were born under Aquarius?",
    					"Which star sign is the first sign of the zodiac?",
    					"If you were born on New Year’s Day, which is your astrological sign?",
    					"What is the ruling planet of Scorpio?",
    					"Pisces and Scorpio are two of the water signs, name the third.",
    					"At which sport in the 1960s did Peggy Fleming become a household name?",
    					"Who revolutionised high jumping when he used his flop technique to win an Olympic gold medal in Mexico in 1968?",
    					"What nationality was tennis player John Newcombe?",
    					"About which golfer did the great Bobby Jones remark : He is playing an entirely different game – a game I’m not even familiar with. ?",
    					"Which tennis player, famous for her two-handed backhand and baseline-dominated play was nicknamed ‘The Ice Maiden’?",
    					"Who was the Argentinian racing driver ( 1911 – 1995 ) who won five world championships and was team leader of Mercedes-Benz, Alfa Romeo, Ferrari and Maserati?",
    					"Which Italian jockey rode his first winner Lizzy Hare, at Goodwood in 1987?",
    					"With which baseball team did Jose DiMaggio achieve icon status in the 1940s?",
    					"What type of cheese is Stilton?",
    					"What do you add to milk to make porridge?",
    					"What is minestrone?",
    					"What is bottled tomato sauce called?",
    					"What colour is gin?",
    					"Which fruit is covered with toffee at a fairground?",
    					"Which nuts are used to make marzipan?",
    					"What meat dish is Cumberland famous for?",
    					"Which British monarch succeeded Queen Victoria?",
    					"Richard III died at which battle?",
    					"Who was the last viceroy of India?",
    					"Which English monarch married Eleanor of Aquitaine?",
    					"Who was the last wife of Henry VIII?",
    					"Which country did Britain fight in the War of Jenkins’ Ear?",
    					"Which King George did Prince Regent become?",
    					"At the Siege of Mafeking, who led the British forces?",
    					"The House of Lancaster kings were all called what?",
    					"Apart from Mad George, which kinder nickname did George III have?"
    					);
    	
    	this.questionList = questions;
    	
    	List<Integer> answerIndex = Arrays.asList(
    				0,3,3,1,0,0,1,0,1,3,
    				0,2,0,3,2,1,1,0,1,3,
    				3,2,1,2,3,0,3,2,1,0,
    				3,1,0,1,3,2,0,1,0,3,
    				2,0,3,0,3,2,0,0,3,2
    				);
    	
    	this.correctAnswers = answerIndex;
    }//default constructor sets up the game since the objects do not need to be dynamically created
    
    public List<String[]> getEntireAnswerList()
    {
    	return this.answersList;
    }//gets the entire list, not really needed
    
    public String[] getAnswersArray(int which)
    {
    	return this.answersList.get(which);
    }//gets the array of the answers
    
    public int getIndexOfCorrectAnswer(int which)
    {
    	return this.correctAnswers.get(which);
    }//gets the correct answer as an integer so it can be inputed as the index to get the string from the array
    
    public String getQuestion(int which)
    {
    	return this.questionList.get(which);
    }//gets the question
     
}
