import java.util.ArrayList;

/**
 * A class to maintain an arbitrarily long list of notes.
 * Notes are numbered for external reference by a human user.
 * In this version, note numbers start at 0.
 * 
 * @author David J. Barnes and Michael Kolling.
 * @version 2008.03.30
 */
public class Notebook
{
    // Storage for an arbitrary number of notes.
    private ArrayList<String> notes;

    /**
     * Perform any initialization that is required for the
     * notebook.
     */
    public Notebook()
    {
        notes = new ArrayList<String>();
    }

    /**
     * Store a new note into the notebook.
     * @param note The note to be stored.
     */
    public void storeNote(String note)
    {
        notes.add(note);
    }

    public void removeNote(int number){
        if(numberOfNotes() <= 0)
            System.out.println("Notebook vazio!");
        else if(number < numberOfNotes())
            notes.remove(number);
        else if(number < 0 || number > numberOfNotes())
            System.out.println("Nota inválida!"); 
    }
    
    public void listAllNotes(){
        for(int i = 0; i < notes.size(); i++){
          System.out.println(notes.get(i));  
        }
    }
    
    public void search(String searchString){

        int i = 0;

        boolean found = false;

        while(i < numberOfNotes() && !found){

            String note = notes.get(i);

            if(note.contains(searchString)){

                found = true;

                System.out.println(notes.get(i));

            }

            else

                i++; 

        }

        if(!found){

            System.out.println("Search term not found!");

        }

    }
    
    /**
     * @return The number of notes currently in the notebook.
     */
    public int numberOfNotes()
    {
        return notes.size();
    }

    /**
     * Show a note.
     * @param noteNumber The number of the note to be shown.
     */
    public void showNote(int noteNumber)
    {
        if(noteNumber < 0) {
            // This is not a valid note number, so do nothing.
        }
        else if(noteNumber < numberOfNotes()) {
            // This is a valid note number, so we can print it.
            System.out.println(notes.get(noteNumber));
        }
        else {
            // This is not a valid note number, so do nothing.
        }
    }
}
