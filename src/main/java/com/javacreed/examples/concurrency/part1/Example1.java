package com.javacreed.examples.concurrency.part1;

public class Example1 {

  public static void main(final String[] args) {
    final SequenceGenerator a = new SequenceGenerator(1L);
    System.out.printf("SG A: %d%n", a.getNextValue());
    System.out.printf("SG A: %d%n", a.getNextValue());

    final SequenceGenerator b = new SequenceGenerator(1L);
    System.out.printf("SG B: %d%n", b.getNextValue());
  }
}
