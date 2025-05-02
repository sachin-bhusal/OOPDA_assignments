public int findBall(int ballType, double costLimit)
{
    for (GolfBall ball : bags)
    {
        if(ball.getBallType()) == ballType && ball.getValue() <= costLimit)
        {
            return positionNumber;
        }
        return -1;
    }
}