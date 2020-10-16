package com.zrkworld.cinema.pojo;

import java.io.Serializable;
import java.util.Arrays;

public class Schart1Data implements Serializable {
    Integer[] consume = new Integer[5];
    Integer[] recharge = new Integer[5];
    Integer[] integral = new Integer[5];

    @Override
    public String toString() {
        return "Schart1Data{" +
                "consume=" + Arrays.toString(consume) +
                ", recharge=" + Arrays.toString(recharge) +
                ", integral=" + Arrays.toString(integral) +
                '}';
    }

    public Integer[] getConsume() {
        return consume;
    }

    public void setConsume(Integer[] consume) {
        this.consume = consume;
    }

    public Integer[] getRecharge() {
        return recharge;
    }

    public void setRecharge(Integer[] recharge) {
        this.recharge = recharge;
    }

    public Integer[] getIntegral() {
        return integral;
    }

    public void setIntegral(Integer[] integral) {
        this.integral = integral;
    }
}
