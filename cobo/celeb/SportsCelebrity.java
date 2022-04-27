import java.util.ArrayList;

/**
 * Subclass of Celebrity to show how methods can be overridden and super can be called while changing functionality.
 * @author cody.henrichsen
 * @version 1.0 15/09/2018
 */
public class SportsCelebrity extends Celebrity
{
	/**
	 * The list of clues for the Sports Celebrity. They can be titles of texts, important characters, settings, etc...s
	 */
	private ArrayList<String> clueList;

	/**
	 * Builds a SportsCelebrity instance with an answer and a series of clues as a String separated by commas.
	 * @param answer The sports celebrity
	 * @param clues Clues for the sports celebrity
	 */
	public SportsCelebrity(String answer, String clues)
	{
		super(answer, clues);
		processClues();
	}

	/**
	 * Processes the series of clues for the SportsCelebrity by adding all the values to an ArrayList<String> by
	 * splitting the original clue to an array of String.
	 * The original value is not impacted, thus preserving data and inheritance integrity.
	 */
	private void processClues()
	{
		String [] clues = super.getClue().split(",");
		clueList = new ArrayList<String>();
		for (String currentClue : clues)
		{
			clueList.add(currentClue);
		}
	}

	/**
	 * Overridden version of the getClue() method that cycles through each of the individual clues in the series.
	 * It recreates the clueList if the user has finished the series of clues.
	 */
	@Override
	public String getClue()
	{
		if (clueList.size() == 0)
		{
			processClues();
		}
		String currentClue = clueList.remove(0);

		return currentClue;
	}


	@Override
	public String toString()
	{
		String dsc = "This is the sports celebrity: " + getAnswer() + "\nThe clues are:\n";

		for (String word : super.getClue().split(","))
		{
			dsc += word + "\n";
		}

		return dsc;
	}

}
