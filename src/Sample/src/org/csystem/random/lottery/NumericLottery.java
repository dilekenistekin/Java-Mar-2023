package org.csystem.random.lottery;

import java.util.Random;

public class NumericLottery {
    private final Random m_random;

    private boolean [] getFlags()
    {
        boolean [] flags = new boolean[50];

        for (int i = 0; i < 6; ++i) {
            int val;

            while (true) {
                val = m_random.nextInt(1, 50);

                if (!flags[val])
                    break;
            }
            flags[val] = true;
        }

        return flags;
    }

    private int [] getNumbers(boolean [] flags)
    {
        int [] numbers = new int[6];
        int idx = 0;

        for (int i = 1; i < 50; ++i)
            if (flags[i])
                numbers[idx++] = i;

        return numbers;
    }

    public NumericLottery(Random r)
    {
        m_random = r;
    }

    public int [] getNumbers()
    {
        return getNumbers(getFlags());
    }

    public int [][] getNumbers(int count)
    {
        int [][] numbers = new int[count][];

        for (int i = 0; i < count; ++i)
            numbers[i] = getNumbers();

        return numbers;
    }
}
