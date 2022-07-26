public class Card
{
  int _rank;
  String _suite;
  int highOrLow;
  
  public Card(int rank, String suite, int highOrLow)
  {
    _rank = rank;
    _suite = suite;
    if (suite.equals('Ace'))
    {
      _highOrLow = 1;
    }
    else
      _highOrlow = 0;
  }

  public int getRank()
  {
    return _rank;
  }

  public String getSuite()
  {
    return _suite;
  }

  public getHighOrLow()
  {
    return _highOrLow;
  }
}