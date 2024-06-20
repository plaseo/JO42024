public class Document
{
    public static String firstname, lastname;
    private int code;

    public Document (String Last, String First, int docCode)
    {
        firstname = First;
        lastname = Last;
        code = docCode;
    }

    public String toString ()
    {
        return "\n\n Name: " + lastname + ", " + firstname + "\n Document Code: " + code + "\n";
    }

    public boolean equals (Object other)
    {
        return (lastname.equals(((Document)other).getLast())&&
        firstname.equals(((Document)other).getFirst()));
    }

    public int compareTo (Object other)
    {

        int result;

        String otherFirst = ((Document)other).getFirst();
        String otherLast = ((Document)other).getLast();

        if (lastname.equals(otherLast))
            result = firstname.compareTo(otherFirst);
        else
            result = lastname.compareTo(otherLast);

        return result;
    }


    public String getFirst ()
    {
        return firstname;
    }

    public String getLast ()
    {
        return lastname;
    }
}
