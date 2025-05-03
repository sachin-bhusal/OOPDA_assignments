To implement sorting by value (descending) and positionNumber (ascending) using the Comparable interface, you need to make changes in only one class which is GolfBall. Inventory class, may use Collections.sort() or similar, but it doesn't require structural changes. For eg implementing Comporable<GolfBall>:
public class GolfBall implements Comparable<GolfBall>
{
  (existing atrributes and methdod from this class.)
}

and then overriding the compareTo() method 

For Inventory class no changes are required in structure but ensuring the sorting is done is necessary
For eg:
Collections.sort(/* whatever ArrayList<GolfBall> is defined to*/) 