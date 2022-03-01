package co.com.sistecredito.certification.falabella.utils;

public enum EnumFailMessages {
  PAY_MESSAGE("Pagar con Gift Card o Tarjeta de Novios");

  private final String failMessage;

  EnumFailMessages(String failMessage) {
    this.failMessage = failMessage;
  }

  public String getFailMessage() {
    return failMessage;
  }
}
