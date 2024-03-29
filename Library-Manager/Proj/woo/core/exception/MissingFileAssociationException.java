package woo.core.exception;

/** Launched when an application is not associated with a file. */
public class MissingFileAssociationException extends Exception {

  /** Serial number for serialization. */
  private static final long serialVersionUID = 201708301010L;

  /**
   * Default constructor
   */
  public MissingFileAssociationException(){}

  @Override
  public String getMessage() {
    return "Não existe nenhum ficheiro associado.";
  }

}
