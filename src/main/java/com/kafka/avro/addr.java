/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.kafka.avro;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class addr extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 1681334261963617486L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"addr\",\"namespace\":\"com.kafka.avro\",\"fields\":[{\"name\":\"ADDRESS_TYPE_CODE\",\"type\":[\"string\",\"null\"],\"definition\":\"Address type (i.e. current, physical, mailing, balance transfer, etc)\"},{\"name\":\"STATE_TYPE_CODE\",\"type\":[\"string\",\"null\"],\"definition\":\"State \"},{\"name\":\"POSTAL_CODE\",\"type\":[\"string\",\"null\"],\"definition\":\"Zip or postal code portion of address\"},{\"name\":\"ADDRESS_STANDARDIZATION_FAILED_FLAG\",\"type\":\"int\",\"definition\":\"Mapped from RedCard API Request entity applicant_information\"},{\"name\":\"REFERENCE_ID\",\"type\":[\"string\",\"null\"],\"definition\":\"Reference ID assigned to the application, displayed to users.  Format of this ID can be defined by the client, it is recommended to be unique.  *application_id from Target API\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<addr> ENCODER =
      new BinaryMessageEncoder<addr>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<addr> DECODER =
      new BinaryMessageDecoder<addr>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<addr> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<addr> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<addr>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this addr to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a addr from a ByteBuffer. */
  public static addr fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence ADDRESS_TYPE_CODE;
  @Deprecated public java.lang.CharSequence STATE_TYPE_CODE;
  @Deprecated public java.lang.CharSequence POSTAL_CODE;
  @Deprecated public int ADDRESS_STANDARDIZATION_FAILED_FLAG;
  @Deprecated public java.lang.CharSequence REFERENCE_ID;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public addr() {}

  /**
   * All-args constructor.
   * @param ADDRESS_TYPE_CODE The new value for ADDRESS_TYPE_CODE
   * @param STATE_TYPE_CODE The new value for STATE_TYPE_CODE
   * @param POSTAL_CODE The new value for POSTAL_CODE
   * @param ADDRESS_STANDARDIZATION_FAILED_FLAG The new value for ADDRESS_STANDARDIZATION_FAILED_FLAG
   * @param REFERENCE_ID The new value for REFERENCE_ID
   */
  public addr(java.lang.CharSequence ADDRESS_TYPE_CODE, java.lang.CharSequence STATE_TYPE_CODE, java.lang.CharSequence POSTAL_CODE, java.lang.Integer ADDRESS_STANDARDIZATION_FAILED_FLAG, java.lang.CharSequence REFERENCE_ID) {
    this.ADDRESS_TYPE_CODE = ADDRESS_TYPE_CODE;
    this.STATE_TYPE_CODE = STATE_TYPE_CODE;
    this.POSTAL_CODE = POSTAL_CODE;
    this.ADDRESS_STANDARDIZATION_FAILED_FLAG = ADDRESS_STANDARDIZATION_FAILED_FLAG;
    this.REFERENCE_ID = REFERENCE_ID;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return ADDRESS_TYPE_CODE;
    case 1: return STATE_TYPE_CODE;
    case 2: return POSTAL_CODE;
    case 3: return ADDRESS_STANDARDIZATION_FAILED_FLAG;
    case 4: return REFERENCE_ID;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: ADDRESS_TYPE_CODE = (java.lang.CharSequence)value$; break;
    case 1: STATE_TYPE_CODE = (java.lang.CharSequence)value$; break;
    case 2: POSTAL_CODE = (java.lang.CharSequence)value$; break;
    case 3: ADDRESS_STANDARDIZATION_FAILED_FLAG = (java.lang.Integer)value$; break;
    case 4: REFERENCE_ID = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'ADDRESS_TYPE_CODE' field.
   * @return The value of the 'ADDRESS_TYPE_CODE' field.
   */
  public java.lang.CharSequence getADDRESSTYPECODE() {
    return ADDRESS_TYPE_CODE;
  }

  /**
   * Sets the value of the 'ADDRESS_TYPE_CODE' field.
   * @param value the value to set.
   */
  public void setADDRESSTYPECODE(java.lang.CharSequence value) {
    this.ADDRESS_TYPE_CODE = value;
  }

  /**
   * Gets the value of the 'STATE_TYPE_CODE' field.
   * @return The value of the 'STATE_TYPE_CODE' field.
   */
  public java.lang.CharSequence getSTATETYPECODE() {
    return STATE_TYPE_CODE;
  }

  /**
   * Sets the value of the 'STATE_TYPE_CODE' field.
   * @param value the value to set.
   */
  public void setSTATETYPECODE(java.lang.CharSequence value) {
    this.STATE_TYPE_CODE = value;
  }

  /**
   * Gets the value of the 'POSTAL_CODE' field.
   * @return The value of the 'POSTAL_CODE' field.
   */
  public java.lang.CharSequence getPOSTALCODE() {
    return POSTAL_CODE;
  }

  /**
   * Sets the value of the 'POSTAL_CODE' field.
   * @param value the value to set.
   */
  public void setPOSTALCODE(java.lang.CharSequence value) {
    this.POSTAL_CODE = value;
  }

  /**
   * Gets the value of the 'ADDRESS_STANDARDIZATION_FAILED_FLAG' field.
   * @return The value of the 'ADDRESS_STANDARDIZATION_FAILED_FLAG' field.
   */
  public java.lang.Integer getADDRESSSTANDARDIZATIONFAILEDFLAG() {
    return ADDRESS_STANDARDIZATION_FAILED_FLAG;
  }

  /**
   * Sets the value of the 'ADDRESS_STANDARDIZATION_FAILED_FLAG' field.
   * @param value the value to set.
   */
  public void setADDRESSSTANDARDIZATIONFAILEDFLAG(java.lang.Integer value) {
    this.ADDRESS_STANDARDIZATION_FAILED_FLAG = value;
  }

  /**
   * Gets the value of the 'REFERENCE_ID' field.
   * @return The value of the 'REFERENCE_ID' field.
   */
  public java.lang.CharSequence getREFERENCEID() {
    return REFERENCE_ID;
  }

  /**
   * Sets the value of the 'REFERENCE_ID' field.
   * @param value the value to set.
   */
  public void setREFERENCEID(java.lang.CharSequence value) {
    this.REFERENCE_ID = value;
  }

  /**
   * Creates a new addr RecordBuilder.
   * @return A new addr RecordBuilder
   */
  public static com.kafka.avro.addr.Builder newBuilder() {
    return new com.kafka.avro.addr.Builder();
  }

  /**
   * Creates a new addr RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new addr RecordBuilder
   */
  public static com.kafka.avro.addr.Builder newBuilder(com.kafka.avro.addr.Builder other) {
    return new com.kafka.avro.addr.Builder(other);
  }

  /**
   * Creates a new addr RecordBuilder by copying an existing addr instance.
   * @param other The existing instance to copy.
   * @return A new addr RecordBuilder
   */
  public static com.kafka.avro.addr.Builder newBuilder(com.kafka.avro.addr other) {
    return new com.kafka.avro.addr.Builder(other);
  }

  /**
   * RecordBuilder for addr instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<addr>
    implements org.apache.avro.data.RecordBuilder<addr> {

    private java.lang.CharSequence ADDRESS_TYPE_CODE;
    private java.lang.CharSequence STATE_TYPE_CODE;
    private java.lang.CharSequence POSTAL_CODE;
    private int ADDRESS_STANDARDIZATION_FAILED_FLAG;
    private java.lang.CharSequence REFERENCE_ID;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.kafka.avro.addr.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.ADDRESS_TYPE_CODE)) {
        this.ADDRESS_TYPE_CODE = data().deepCopy(fields()[0].schema(), other.ADDRESS_TYPE_CODE);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.STATE_TYPE_CODE)) {
        this.STATE_TYPE_CODE = data().deepCopy(fields()[1].schema(), other.STATE_TYPE_CODE);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.POSTAL_CODE)) {
        this.POSTAL_CODE = data().deepCopy(fields()[2].schema(), other.POSTAL_CODE);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.ADDRESS_STANDARDIZATION_FAILED_FLAG)) {
        this.ADDRESS_STANDARDIZATION_FAILED_FLAG = data().deepCopy(fields()[3].schema(), other.ADDRESS_STANDARDIZATION_FAILED_FLAG);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.REFERENCE_ID)) {
        this.REFERENCE_ID = data().deepCopy(fields()[4].schema(), other.REFERENCE_ID);
        fieldSetFlags()[4] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing addr instance
     * @param other The existing instance to copy.
     */
    private Builder(com.kafka.avro.addr other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.ADDRESS_TYPE_CODE)) {
        this.ADDRESS_TYPE_CODE = data().deepCopy(fields()[0].schema(), other.ADDRESS_TYPE_CODE);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.STATE_TYPE_CODE)) {
        this.STATE_TYPE_CODE = data().deepCopy(fields()[1].schema(), other.STATE_TYPE_CODE);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.POSTAL_CODE)) {
        this.POSTAL_CODE = data().deepCopy(fields()[2].schema(), other.POSTAL_CODE);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.ADDRESS_STANDARDIZATION_FAILED_FLAG)) {
        this.ADDRESS_STANDARDIZATION_FAILED_FLAG = data().deepCopy(fields()[3].schema(), other.ADDRESS_STANDARDIZATION_FAILED_FLAG);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.REFERENCE_ID)) {
        this.REFERENCE_ID = data().deepCopy(fields()[4].schema(), other.REFERENCE_ID);
        fieldSetFlags()[4] = true;
      }
    }

    /**
      * Gets the value of the 'ADDRESS_TYPE_CODE' field.
      * @return The value.
      */
    public java.lang.CharSequence getADDRESSTYPECODE() {
      return ADDRESS_TYPE_CODE;
    }

    /**
      * Sets the value of the 'ADDRESS_TYPE_CODE' field.
      * @param value The value of 'ADDRESS_TYPE_CODE'.
      * @return This builder.
      */
    public com.kafka.avro.addr.Builder setADDRESSTYPECODE(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.ADDRESS_TYPE_CODE = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'ADDRESS_TYPE_CODE' field has been set.
      * @return True if the 'ADDRESS_TYPE_CODE' field has been set, false otherwise.
      */
    public boolean hasADDRESSTYPECODE() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'ADDRESS_TYPE_CODE' field.
      * @return This builder.
      */
    public com.kafka.avro.addr.Builder clearADDRESSTYPECODE() {
      ADDRESS_TYPE_CODE = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'STATE_TYPE_CODE' field.
      * @return The value.
      */
    public java.lang.CharSequence getSTATETYPECODE() {
      return STATE_TYPE_CODE;
    }

    /**
      * Sets the value of the 'STATE_TYPE_CODE' field.
      * @param value The value of 'STATE_TYPE_CODE'.
      * @return This builder.
      */
    public com.kafka.avro.addr.Builder setSTATETYPECODE(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.STATE_TYPE_CODE = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'STATE_TYPE_CODE' field has been set.
      * @return True if the 'STATE_TYPE_CODE' field has been set, false otherwise.
      */
    public boolean hasSTATETYPECODE() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'STATE_TYPE_CODE' field.
      * @return This builder.
      */
    public com.kafka.avro.addr.Builder clearSTATETYPECODE() {
      STATE_TYPE_CODE = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'POSTAL_CODE' field.
      * @return The value.
      */
    public java.lang.CharSequence getPOSTALCODE() {
      return POSTAL_CODE;
    }

    /**
      * Sets the value of the 'POSTAL_CODE' field.
      * @param value The value of 'POSTAL_CODE'.
      * @return This builder.
      */
    public com.kafka.avro.addr.Builder setPOSTALCODE(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.POSTAL_CODE = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'POSTAL_CODE' field has been set.
      * @return True if the 'POSTAL_CODE' field has been set, false otherwise.
      */
    public boolean hasPOSTALCODE() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'POSTAL_CODE' field.
      * @return This builder.
      */
    public com.kafka.avro.addr.Builder clearPOSTALCODE() {
      POSTAL_CODE = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'ADDRESS_STANDARDIZATION_FAILED_FLAG' field.
      * @return The value.
      */
    public java.lang.Integer getADDRESSSTANDARDIZATIONFAILEDFLAG() {
      return ADDRESS_STANDARDIZATION_FAILED_FLAG;
    }

    /**
      * Sets the value of the 'ADDRESS_STANDARDIZATION_FAILED_FLAG' field.
      * @param value The value of 'ADDRESS_STANDARDIZATION_FAILED_FLAG'.
      * @return This builder.
      */
    public com.kafka.avro.addr.Builder setADDRESSSTANDARDIZATIONFAILEDFLAG(int value) {
      validate(fields()[3], value);
      this.ADDRESS_STANDARDIZATION_FAILED_FLAG = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'ADDRESS_STANDARDIZATION_FAILED_FLAG' field has been set.
      * @return True if the 'ADDRESS_STANDARDIZATION_FAILED_FLAG' field has been set, false otherwise.
      */
    public boolean hasADDRESSSTANDARDIZATIONFAILEDFLAG() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'ADDRESS_STANDARDIZATION_FAILED_FLAG' field.
      * @return This builder.
      */
    public com.kafka.avro.addr.Builder clearADDRESSSTANDARDIZATIONFAILEDFLAG() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'REFERENCE_ID' field.
      * @return The value.
      */
    public java.lang.CharSequence getREFERENCEID() {
      return REFERENCE_ID;
    }

    /**
      * Sets the value of the 'REFERENCE_ID' field.
      * @param value The value of 'REFERENCE_ID'.
      * @return This builder.
      */
    public com.kafka.avro.addr.Builder setREFERENCEID(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.REFERENCE_ID = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'REFERENCE_ID' field has been set.
      * @return True if the 'REFERENCE_ID' field has been set, false otherwise.
      */
    public boolean hasREFERENCEID() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'REFERENCE_ID' field.
      * @return This builder.
      */
    public com.kafka.avro.addr.Builder clearREFERENCEID() {
      REFERENCE_ID = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public addr build() {
      try {
        addr record = new addr();
        record.ADDRESS_TYPE_CODE = fieldSetFlags()[0] ? this.ADDRESS_TYPE_CODE : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.STATE_TYPE_CODE = fieldSetFlags()[1] ? this.STATE_TYPE_CODE : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.POSTAL_CODE = fieldSetFlags()[2] ? this.POSTAL_CODE : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.ADDRESS_STANDARDIZATION_FAILED_FLAG = fieldSetFlags()[3] ? this.ADDRESS_STANDARDIZATION_FAILED_FLAG : (java.lang.Integer) defaultValue(fields()[3]);
        record.REFERENCE_ID = fieldSetFlags()[4] ? this.REFERENCE_ID : (java.lang.CharSequence) defaultValue(fields()[4]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<addr>
    WRITER$ = (org.apache.avro.io.DatumWriter<addr>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<addr>
    READER$ = (org.apache.avro.io.DatumReader<addr>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
