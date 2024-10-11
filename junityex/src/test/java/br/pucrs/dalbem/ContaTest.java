package br.pucrs.dalbem;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class ContaTest {
 private Conta conta;
 @Test
 public void deposita1000test() {
 conta = new Conta(0.0);
 conta.depositar(1000.0);
 assertEquals(1000.0,conta.getSaldo());
 }
}