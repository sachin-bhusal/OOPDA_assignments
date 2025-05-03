@Override
public int compareTo(GolfBall another) 
{
    
    if (this.value != another.value) 
    {
        return Double.compare(another.value, this.value);
    }

    return Integer.compare(this.positionNumber, another.positionNumber); 
}
