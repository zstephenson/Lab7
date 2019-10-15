package edu.cscc;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RPSLSpockTest {
    private RPSLSpock spock;

    @Before
    public void pretests() {
        spock = new RPSLSpock();
    }

    @Test
    public void testIsValidPick() {
        Assert.assertTrue(spock.isValidPick("rock"));
        Assert.assertTrue(spock.isValidPick("paper"));
        Assert.assertTrue(spock.isValidPick("scissors"));
        Assert.assertTrue(spock.isValidPick("lizard"));
        Assert.assertTrue(spock.isValidPick("spock"));
        Assert.assertFalse(spock.isValidPick(""));
    }

    @Test
    public void testGeneratePick() {
        String pick = spock.generatePick();
        Assert.assertTrue(spock.isValidPick(pick));
    }

    @Test
    public void testIsComputerWin() {
        Assert.assertTrue(spock.isComputerWin("rock", "scissors"));
        Assert.assertTrue(spock.isComputerWin("rock", "lizard"));
        Assert.assertTrue(spock.isComputerWin("paper", "rock"));
        Assert.assertTrue(spock.isComputerWin("paper", "spock"));
        Assert.assertTrue(spock.isComputerWin("scissors", "paper"));
        Assert.assertTrue(spock.isComputerWin("scissors", "lizard"));
        Assert.assertTrue(spock.isComputerWin("lizard", "paper"));
        Assert.assertTrue(spock.isComputerWin("lizard", "spock"));
        Assert.assertTrue(spock.isComputerWin("spock", "rock"));
        Assert.assertTrue(spock.isComputerWin("spock", "scissors"));
        Assert.assertFalse(spock.isComputerWin("spock", "spock"));
        Assert.assertFalse(spock.isComputerWin("rock", "paper"));
    }
}