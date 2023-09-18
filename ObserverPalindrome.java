public class ObserverPalindrome implements Observer {
    int count;

    public ObserverPalindrome(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    @Override
    public void traiterLigne(String ligne) {
        for (String mot : ligne.trim().split(" ")) {
            StringBuffer temp = new StringBuffer(mot);
            if (mot.equals(temp.reverse().toString())) {
                count++;
            }
        }
    }
}
