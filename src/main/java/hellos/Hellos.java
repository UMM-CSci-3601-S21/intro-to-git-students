package hellos;

/**
 * A simple Java program used to demonstrate merge conflicts when
 * multiple people edit the same piece of code.
 */
public class Hellos {

  public static void main(String[] args) {
    Hellos helloRunner = new Hellos();
    helloRunner.run();
  }

  public void run() {
    String output = generateOutput();
    System.out.println(output);
  }

  public String generateOutput() {
    StringBuilder builder = new StringBuilder();

    builder.append(aliceSaysHello());
    builder.append(birukSaysHello());
    builder.append(blakeSaysHello());
    builder.append(cassieSaysHello());
    builder.append(danteSaysHello());
    builder.append(elenaSaysHello());
    builder.append(elmuradSaysHello());
    builder.append(halleySaysHi());
    builder.append(isabelleSaysHello());
    builder.append(jacobSaysHello());
    builder.append(jadynSaysHello());
    builder.append(jeffSaysHello());
    builder.append(jonahSaysHello());
    builder.append(joshSaysHello());
    builder.append(joshuaSaysHello());
    builder.append(justinSaysHello());
    builder.append(kkSaysHello());
    builder.append(kyleSaysHello());
    builder.append(lloydSaysHello());
    builder.append(natashaSaysHello());
    builder.append(nicSaysHello());
    builder.append(noahSaysHello());
    builder.append(richardSaysHello());
    builder.append(susanSaysHi());
    builder.append(thomasSaysHello());

    return builder.toString();
  }

  private static String jacobSaysHello() {
    return "Jacob says 'Salutations!'\n";
  }

  private String lloydSaysHello() {
    return "Lloyd says 'Wassup!'\n";
  }

  private static String joshSaysHello() {
    return "Josh says 'Hello World!'\n";
  }

  private String birukSaysHello() {
    return "Biruk says 'Yo!'\n";
  }

  private String nicSaysHello() {
    return "Nic says 'Howdy!'\n";
  }

  private String kkSaysHello() {
    return "KK says 'Hello!'\n";
  }

  private String elmuradSaysHello() {
    return "Elmurad says 'Hello!'\n";
  }

  private String kyleSaysHello() {
    return "Kyle says 'Salutations!'\n";
  }

  private String isabelleSaysHello() {
    return "Isabelle says 'Hi!'\n";
  }

  private String danteSaysHello() {
    return "Dante says 'Hello!'\n";
  }

  private String natashaSaysHello() {
    return "Natasha says 'Hi!'\n";
  }

  private String susanSaysHi() {
    return "Susan says 'Welcome!'\n";
  }

  private String thomasSaysHello() {
    return "Thomas says 'Hola!'\n";
  }

  private String blakeSaysHello() {
    return "Blake says 'What's up!'\n";
  }

  private String jonahSaysHello() {
    return "Jonah says 'Hi!'\n";
  }
  private String halleySaysHi() {
    return "Halley says 'Yo!'\n";
  }

  private String richardSaysHello() {
    return "Richard says 'Hiya!'\n";
  }

  private String jadynSaysHello() {
    return "Jadyn says 'Hi!'\n";
  }

  private String justinSaysHello() {
    return "Justin says 'Oh...well hello there!'\n";
  }

  private String noahSaysHello() {
    return "Noah says 'Hey!'\n";
  }

  private String joshuaSaysHello() {
    return "Joshua says 'Hello!'\n";
  }

  private String jeffSaysHello() {
    return "Jeff says 'Hello!'\n";
  }

  private String aliceSaysHello() {
    return "Alice says 'Hello!'\n";
  }

  private String elenaSaysHello() {
    return "Elena says 'Xin chào!'\n";
  }

  private String cassieSaysHello() {
    return "Cassie says 'Hello!'\n";
  }
}
