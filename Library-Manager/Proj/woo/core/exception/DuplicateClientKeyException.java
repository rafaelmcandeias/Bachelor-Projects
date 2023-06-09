package woo.core.exception;

/** Exception thrown when a client key is duplicated. */
public class DuplicateClientKeyException extends Exception {

  /** Serial number for serialization. */
  private static final long serialVersionUID = 2017090213241L;

  /** Client key. */
  private String _key;

  /** @param key the duplicated key */
  public DuplicateClientKeyException(String key) {
    _key = key;
  }

  public String getKey() {
    return _key;
  }

}
