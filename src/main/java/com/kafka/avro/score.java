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
public class score extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 7435156676972199470L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"score\",\"namespace\":\"com.kafka.avro\",\"fields\":[{\"name\":\"SCORE_ID\",\"type\":[\"string\",\"null\"],\"definition\":\"Uniquely identifies each score. This ID is expected to be assigned by the Zoot system and be unique.  This ID must be unique per score within a given transaction/application.\"},{\"name\":\"DECISION_ID\",\"type\":[\"string\",\"null\"],\"definition\":\"Uniquely identifies each decision.\"},{\"name\":\"LEGAL_ENTITY_ID\",\"type\":[\"string\",\"null\"],\"definition\":\"The ID of the applicant that the attribute applies to.\"},{\"name\":\"DATA_PROVIDER_REPORT_ID\",\"type\":[\"string\",\"null\"],\"definition\":\"The ID of the data provider report that the attribute applies to/was derived from.\"},{\"name\":\"SCORE_TYPE_CODE\",\"type\":[\"string\",\"null\"],\"definition\":\"The code assigned to identifiy the score.\"},{\"name\":\"VALUE\",\"type\":[\"string\",\"null\"],\"definition\":\"The value of the score.\"},{\"name\":\"INSRT_TS\",\"type\":[\"string\",\"null\"],\"definition\":\"Date/Time of the insert of the record into the database.  At initial insertion, the insrt_ts and chng_ts will be the same. Once populated this column should never change.\"},{\"name\":\"CHNG_TS\",\"type\":[\"string\",\"null\"],\"definition\":\"Date/Time that any column for a given row in the table is changed.  At initial insertion, the insrt_ts and chng_ts should be the same. Any modification to the record going forward will update this column with the current date/time.\"},{\"name\":\"INSRT_USR_ID\",\"type\":[\"string\",\"null\"],\"definition\":\"The insrt_usr_id column is the system UUID for the user name of the person using the application that made the initial insert of this row of data. At initial row insertion time the insrt_usr_id and chng_usr_id should be the same. Once populated this column should never change.\"},{\"name\":\"CHNG_USR_ID\",\"type\":[\"string\",\"null\"],\"definition\":\"The chng_usr_id column is the system UUID  for the user name of the person using the application that made the most recent change to this row of data. At initial row insertion time the insrt_usr_id and chng_usr_id should be the same. Any subsequent change to data in a given row should require an update of this column.\"},{\"name\":\"ACTIVE_FLAG\",\"type\":\"int\",\"definition\":\"The value of the attribute.\"},{\"name\":\"REFERENCE_ID\",\"type\":[\"string\",\"null\"],\"definition\":\"Reference ID assigned to the application, displayed to users.  Format of this ID can be defined by the client, it is recommended to be unique.  *application_id from Target API\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<score> ENCODER =
      new BinaryMessageEncoder<score>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<score> DECODER =
      new BinaryMessageDecoder<score>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<score> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<score> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<score>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this score to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a score from a ByteBuffer. */
  public static score fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence SCORE_ID;
  @Deprecated public java.lang.CharSequence DECISION_ID;
  @Deprecated public java.lang.CharSequence LEGAL_ENTITY_ID;
  @Deprecated public java.lang.CharSequence DATA_PROVIDER_REPORT_ID;
  @Deprecated public java.lang.CharSequence SCORE_TYPE_CODE;
  @Deprecated public java.lang.CharSequence VALUE;
  @Deprecated public java.lang.CharSequence INSRT_TS;
  @Deprecated public java.lang.CharSequence CHNG_TS;
  @Deprecated public java.lang.CharSequence INSRT_USR_ID;
  @Deprecated public java.lang.CharSequence CHNG_USR_ID;
  @Deprecated public int ACTIVE_FLAG;
  @Deprecated public java.lang.CharSequence REFERENCE_ID;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public score() {}

  /**
   * All-args constructor.
   * @param SCORE_ID The new value for SCORE_ID
   * @param DECISION_ID The new value for DECISION_ID
   * @param LEGAL_ENTITY_ID The new value for LEGAL_ENTITY_ID
   * @param DATA_PROVIDER_REPORT_ID The new value for DATA_PROVIDER_REPORT_ID
   * @param SCORE_TYPE_CODE The new value for SCORE_TYPE_CODE
   * @param VALUE The new value for VALUE
   * @param INSRT_TS The new value for INSRT_TS
   * @param CHNG_TS The new value for CHNG_TS
   * @param INSRT_USR_ID The new value for INSRT_USR_ID
   * @param CHNG_USR_ID The new value for CHNG_USR_ID
   * @param ACTIVE_FLAG The new value for ACTIVE_FLAG
   * @param REFERENCE_ID The new value for REFERENCE_ID
   */
  public score(java.lang.CharSequence SCORE_ID, java.lang.CharSequence DECISION_ID, java.lang.CharSequence LEGAL_ENTITY_ID, java.lang.CharSequence DATA_PROVIDER_REPORT_ID, java.lang.CharSequence SCORE_TYPE_CODE, java.lang.CharSequence VALUE, java.lang.CharSequence INSRT_TS, java.lang.CharSequence CHNG_TS, java.lang.CharSequence INSRT_USR_ID, java.lang.CharSequence CHNG_USR_ID, java.lang.Integer ACTIVE_FLAG, java.lang.CharSequence REFERENCE_ID) {
    this.SCORE_ID = SCORE_ID;
    this.DECISION_ID = DECISION_ID;
    this.LEGAL_ENTITY_ID = LEGAL_ENTITY_ID;
    this.DATA_PROVIDER_REPORT_ID = DATA_PROVIDER_REPORT_ID;
    this.SCORE_TYPE_CODE = SCORE_TYPE_CODE;
    this.VALUE = VALUE;
    this.INSRT_TS = INSRT_TS;
    this.CHNG_TS = CHNG_TS;
    this.INSRT_USR_ID = INSRT_USR_ID;
    this.CHNG_USR_ID = CHNG_USR_ID;
    this.ACTIVE_FLAG = ACTIVE_FLAG;
    this.REFERENCE_ID = REFERENCE_ID;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return SCORE_ID;
    case 1: return DECISION_ID;
    case 2: return LEGAL_ENTITY_ID;
    case 3: return DATA_PROVIDER_REPORT_ID;
    case 4: return SCORE_TYPE_CODE;
    case 5: return VALUE;
    case 6: return INSRT_TS;
    case 7: return CHNG_TS;
    case 8: return INSRT_USR_ID;
    case 9: return CHNG_USR_ID;
    case 10: return ACTIVE_FLAG;
    case 11: return REFERENCE_ID;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: SCORE_ID = (java.lang.CharSequence)value$; break;
    case 1: DECISION_ID = (java.lang.CharSequence)value$; break;
    case 2: LEGAL_ENTITY_ID = (java.lang.CharSequence)value$; break;
    case 3: DATA_PROVIDER_REPORT_ID = (java.lang.CharSequence)value$; break;
    case 4: SCORE_TYPE_CODE = (java.lang.CharSequence)value$; break;
    case 5: VALUE = (java.lang.CharSequence)value$; break;
    case 6: INSRT_TS = (java.lang.CharSequence)value$; break;
    case 7: CHNG_TS = (java.lang.CharSequence)value$; break;
    case 8: INSRT_USR_ID = (java.lang.CharSequence)value$; break;
    case 9: CHNG_USR_ID = (java.lang.CharSequence)value$; break;
    case 10: ACTIVE_FLAG = (java.lang.Integer)value$; break;
    case 11: REFERENCE_ID = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'SCORE_ID' field.
   * @return The value of the 'SCORE_ID' field.
   */
  public java.lang.CharSequence getSCOREID() {
    return SCORE_ID;
  }

  /**
   * Sets the value of the 'SCORE_ID' field.
   * @param value the value to set.
   */
  public void setSCOREID(java.lang.CharSequence value) {
    this.SCORE_ID = value;
  }

  /**
   * Gets the value of the 'DECISION_ID' field.
   * @return The value of the 'DECISION_ID' field.
   */
  public java.lang.CharSequence getDECISIONID() {
    return DECISION_ID;
  }

  /**
   * Sets the value of the 'DECISION_ID' field.
   * @param value the value to set.
   */
  public void setDECISIONID(java.lang.CharSequence value) {
    this.DECISION_ID = value;
  }

  /**
   * Gets the value of the 'LEGAL_ENTITY_ID' field.
   * @return The value of the 'LEGAL_ENTITY_ID' field.
   */
  public java.lang.CharSequence getLEGALENTITYID() {
    return LEGAL_ENTITY_ID;
  }

  /**
   * Sets the value of the 'LEGAL_ENTITY_ID' field.
   * @param value the value to set.
   */
  public void setLEGALENTITYID(java.lang.CharSequence value) {
    this.LEGAL_ENTITY_ID = value;
  }

  /**
   * Gets the value of the 'DATA_PROVIDER_REPORT_ID' field.
   * @return The value of the 'DATA_PROVIDER_REPORT_ID' field.
   */
  public java.lang.CharSequence getDATAPROVIDERREPORTID() {
    return DATA_PROVIDER_REPORT_ID;
  }

  /**
   * Sets the value of the 'DATA_PROVIDER_REPORT_ID' field.
   * @param value the value to set.
   */
  public void setDATAPROVIDERREPORTID(java.lang.CharSequence value) {
    this.DATA_PROVIDER_REPORT_ID = value;
  }

  /**
   * Gets the value of the 'SCORE_TYPE_CODE' field.
   * @return The value of the 'SCORE_TYPE_CODE' field.
   */
  public java.lang.CharSequence getSCORETYPECODE() {
    return SCORE_TYPE_CODE;
  }

  /**
   * Sets the value of the 'SCORE_TYPE_CODE' field.
   * @param value the value to set.
   */
  public void setSCORETYPECODE(java.lang.CharSequence value) {
    this.SCORE_TYPE_CODE = value;
  }

  /**
   * Gets the value of the 'VALUE' field.
   * @return The value of the 'VALUE' field.
   */
  public java.lang.CharSequence getVALUE() {
    return VALUE;
  }

  /**
   * Sets the value of the 'VALUE' field.
   * @param value the value to set.
   */
  public void setVALUE(java.lang.CharSequence value) {
    this.VALUE = value;
  }

  /**
   * Gets the value of the 'INSRT_TS' field.
   * @return The value of the 'INSRT_TS' field.
   */
  public java.lang.CharSequence getINSRTTS() {
    return INSRT_TS;
  }

  /**
   * Sets the value of the 'INSRT_TS' field.
   * @param value the value to set.
   */
  public void setINSRTTS(java.lang.CharSequence value) {
    this.INSRT_TS = value;
  }

  /**
   * Gets the value of the 'CHNG_TS' field.
   * @return The value of the 'CHNG_TS' field.
   */
  public java.lang.CharSequence getCHNGTS() {
    return CHNG_TS;
  }

  /**
   * Sets the value of the 'CHNG_TS' field.
   * @param value the value to set.
   */
  public void setCHNGTS(java.lang.CharSequence value) {
    this.CHNG_TS = value;
  }

  /**
   * Gets the value of the 'INSRT_USR_ID' field.
   * @return The value of the 'INSRT_USR_ID' field.
   */
  public java.lang.CharSequence getINSRTUSRID() {
    return INSRT_USR_ID;
  }

  /**
   * Sets the value of the 'INSRT_USR_ID' field.
   * @param value the value to set.
   */
  public void setINSRTUSRID(java.lang.CharSequence value) {
    this.INSRT_USR_ID = value;
  }

  /**
   * Gets the value of the 'CHNG_USR_ID' field.
   * @return The value of the 'CHNG_USR_ID' field.
   */
  public java.lang.CharSequence getCHNGUSRID() {
    return CHNG_USR_ID;
  }

  /**
   * Sets the value of the 'CHNG_USR_ID' field.
   * @param value the value to set.
   */
  public void setCHNGUSRID(java.lang.CharSequence value) {
    this.CHNG_USR_ID = value;
  }

  /**
   * Gets the value of the 'ACTIVE_FLAG' field.
   * @return The value of the 'ACTIVE_FLAG' field.
   */
  public java.lang.Integer getACTIVEFLAG() {
    return ACTIVE_FLAG;
  }

  /**
   * Sets the value of the 'ACTIVE_FLAG' field.
   * @param value the value to set.
   */
  public void setACTIVEFLAG(java.lang.Integer value) {
    this.ACTIVE_FLAG = value;
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
   * Creates a new score RecordBuilder.
   * @return A new score RecordBuilder
   */
  public static com.kafka.avro.score.Builder newBuilder() {
    return new com.kafka.avro.score.Builder();
  }

  /**
   * Creates a new score RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new score RecordBuilder
   */
  public static com.kafka.avro.score.Builder newBuilder(com.kafka.avro.score.Builder other) {
    return new com.kafka.avro.score.Builder(other);
  }

  /**
   * Creates a new score RecordBuilder by copying an existing score instance.
   * @param other The existing instance to copy.
   * @return A new score RecordBuilder
   */
  public static com.kafka.avro.score.Builder newBuilder(com.kafka.avro.score other) {
    return new com.kafka.avro.score.Builder(other);
  }

  /**
   * RecordBuilder for score instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<score>
    implements org.apache.avro.data.RecordBuilder<score> {

    private java.lang.CharSequence SCORE_ID;
    private java.lang.CharSequence DECISION_ID;
    private java.lang.CharSequence LEGAL_ENTITY_ID;
    private java.lang.CharSequence DATA_PROVIDER_REPORT_ID;
    private java.lang.CharSequence SCORE_TYPE_CODE;
    private java.lang.CharSequence VALUE;
    private java.lang.CharSequence INSRT_TS;
    private java.lang.CharSequence CHNG_TS;
    private java.lang.CharSequence INSRT_USR_ID;
    private java.lang.CharSequence CHNG_USR_ID;
    private int ACTIVE_FLAG;
    private java.lang.CharSequence REFERENCE_ID;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.kafka.avro.score.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.SCORE_ID)) {
        this.SCORE_ID = data().deepCopy(fields()[0].schema(), other.SCORE_ID);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.DECISION_ID)) {
        this.DECISION_ID = data().deepCopy(fields()[1].schema(), other.DECISION_ID);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.LEGAL_ENTITY_ID)) {
        this.LEGAL_ENTITY_ID = data().deepCopy(fields()[2].schema(), other.LEGAL_ENTITY_ID);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.DATA_PROVIDER_REPORT_ID)) {
        this.DATA_PROVIDER_REPORT_ID = data().deepCopy(fields()[3].schema(), other.DATA_PROVIDER_REPORT_ID);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.SCORE_TYPE_CODE)) {
        this.SCORE_TYPE_CODE = data().deepCopy(fields()[4].schema(), other.SCORE_TYPE_CODE);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.VALUE)) {
        this.VALUE = data().deepCopy(fields()[5].schema(), other.VALUE);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.INSRT_TS)) {
        this.INSRT_TS = data().deepCopy(fields()[6].schema(), other.INSRT_TS);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.CHNG_TS)) {
        this.CHNG_TS = data().deepCopy(fields()[7].schema(), other.CHNG_TS);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.INSRT_USR_ID)) {
        this.INSRT_USR_ID = data().deepCopy(fields()[8].schema(), other.INSRT_USR_ID);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.CHNG_USR_ID)) {
        this.CHNG_USR_ID = data().deepCopy(fields()[9].schema(), other.CHNG_USR_ID);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.ACTIVE_FLAG)) {
        this.ACTIVE_FLAG = data().deepCopy(fields()[10].schema(), other.ACTIVE_FLAG);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.REFERENCE_ID)) {
        this.REFERENCE_ID = data().deepCopy(fields()[11].schema(), other.REFERENCE_ID);
        fieldSetFlags()[11] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing score instance
     * @param other The existing instance to copy.
     */
    private Builder(com.kafka.avro.score other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.SCORE_ID)) {
        this.SCORE_ID = data().deepCopy(fields()[0].schema(), other.SCORE_ID);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.DECISION_ID)) {
        this.DECISION_ID = data().deepCopy(fields()[1].schema(), other.DECISION_ID);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.LEGAL_ENTITY_ID)) {
        this.LEGAL_ENTITY_ID = data().deepCopy(fields()[2].schema(), other.LEGAL_ENTITY_ID);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.DATA_PROVIDER_REPORT_ID)) {
        this.DATA_PROVIDER_REPORT_ID = data().deepCopy(fields()[3].schema(), other.DATA_PROVIDER_REPORT_ID);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.SCORE_TYPE_CODE)) {
        this.SCORE_TYPE_CODE = data().deepCopy(fields()[4].schema(), other.SCORE_TYPE_CODE);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.VALUE)) {
        this.VALUE = data().deepCopy(fields()[5].schema(), other.VALUE);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.INSRT_TS)) {
        this.INSRT_TS = data().deepCopy(fields()[6].schema(), other.INSRT_TS);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.CHNG_TS)) {
        this.CHNG_TS = data().deepCopy(fields()[7].schema(), other.CHNG_TS);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.INSRT_USR_ID)) {
        this.INSRT_USR_ID = data().deepCopy(fields()[8].schema(), other.INSRT_USR_ID);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.CHNG_USR_ID)) {
        this.CHNG_USR_ID = data().deepCopy(fields()[9].schema(), other.CHNG_USR_ID);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.ACTIVE_FLAG)) {
        this.ACTIVE_FLAG = data().deepCopy(fields()[10].schema(), other.ACTIVE_FLAG);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.REFERENCE_ID)) {
        this.REFERENCE_ID = data().deepCopy(fields()[11].schema(), other.REFERENCE_ID);
        fieldSetFlags()[11] = true;
      }
    }

    /**
      * Gets the value of the 'SCORE_ID' field.
      * @return The value.
      */
    public java.lang.CharSequence getSCOREID() {
      return SCORE_ID;
    }

    /**
      * Sets the value of the 'SCORE_ID' field.
      * @param value The value of 'SCORE_ID'.
      * @return This builder.
      */
    public com.kafka.avro.score.Builder setSCOREID(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.SCORE_ID = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'SCORE_ID' field has been set.
      * @return True if the 'SCORE_ID' field has been set, false otherwise.
      */
    public boolean hasSCOREID() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'SCORE_ID' field.
      * @return This builder.
      */
    public com.kafka.avro.score.Builder clearSCOREID() {
      SCORE_ID = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'DECISION_ID' field.
      * @return The value.
      */
    public java.lang.CharSequence getDECISIONID() {
      return DECISION_ID;
    }

    /**
      * Sets the value of the 'DECISION_ID' field.
      * @param value The value of 'DECISION_ID'.
      * @return This builder.
      */
    public com.kafka.avro.score.Builder setDECISIONID(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.DECISION_ID = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'DECISION_ID' field has been set.
      * @return True if the 'DECISION_ID' field has been set, false otherwise.
      */
    public boolean hasDECISIONID() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'DECISION_ID' field.
      * @return This builder.
      */
    public com.kafka.avro.score.Builder clearDECISIONID() {
      DECISION_ID = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'LEGAL_ENTITY_ID' field.
      * @return The value.
      */
    public java.lang.CharSequence getLEGALENTITYID() {
      return LEGAL_ENTITY_ID;
    }

    /**
      * Sets the value of the 'LEGAL_ENTITY_ID' field.
      * @param value The value of 'LEGAL_ENTITY_ID'.
      * @return This builder.
      */
    public com.kafka.avro.score.Builder setLEGALENTITYID(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.LEGAL_ENTITY_ID = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'LEGAL_ENTITY_ID' field has been set.
      * @return True if the 'LEGAL_ENTITY_ID' field has been set, false otherwise.
      */
    public boolean hasLEGALENTITYID() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'LEGAL_ENTITY_ID' field.
      * @return This builder.
      */
    public com.kafka.avro.score.Builder clearLEGALENTITYID() {
      LEGAL_ENTITY_ID = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'DATA_PROVIDER_REPORT_ID' field.
      * @return The value.
      */
    public java.lang.CharSequence getDATAPROVIDERREPORTID() {
      return DATA_PROVIDER_REPORT_ID;
    }

    /**
      * Sets the value of the 'DATA_PROVIDER_REPORT_ID' field.
      * @param value The value of 'DATA_PROVIDER_REPORT_ID'.
      * @return This builder.
      */
    public com.kafka.avro.score.Builder setDATAPROVIDERREPORTID(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.DATA_PROVIDER_REPORT_ID = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'DATA_PROVIDER_REPORT_ID' field has been set.
      * @return True if the 'DATA_PROVIDER_REPORT_ID' field has been set, false otherwise.
      */
    public boolean hasDATAPROVIDERREPORTID() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'DATA_PROVIDER_REPORT_ID' field.
      * @return This builder.
      */
    public com.kafka.avro.score.Builder clearDATAPROVIDERREPORTID() {
      DATA_PROVIDER_REPORT_ID = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'SCORE_TYPE_CODE' field.
      * @return The value.
      */
    public java.lang.CharSequence getSCORETYPECODE() {
      return SCORE_TYPE_CODE;
    }

    /**
      * Sets the value of the 'SCORE_TYPE_CODE' field.
      * @param value The value of 'SCORE_TYPE_CODE'.
      * @return This builder.
      */
    public com.kafka.avro.score.Builder setSCORETYPECODE(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.SCORE_TYPE_CODE = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'SCORE_TYPE_CODE' field has been set.
      * @return True if the 'SCORE_TYPE_CODE' field has been set, false otherwise.
      */
    public boolean hasSCORETYPECODE() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'SCORE_TYPE_CODE' field.
      * @return This builder.
      */
    public com.kafka.avro.score.Builder clearSCORETYPECODE() {
      SCORE_TYPE_CODE = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'VALUE' field.
      * @return The value.
      */
    public java.lang.CharSequence getVALUE() {
      return VALUE;
    }

    /**
      * Sets the value of the 'VALUE' field.
      * @param value The value of 'VALUE'.
      * @return This builder.
      */
    public com.kafka.avro.score.Builder setVALUE(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.VALUE = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'VALUE' field has been set.
      * @return True if the 'VALUE' field has been set, false otherwise.
      */
    public boolean hasVALUE() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'VALUE' field.
      * @return This builder.
      */
    public com.kafka.avro.score.Builder clearVALUE() {
      VALUE = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'INSRT_TS' field.
      * @return The value.
      */
    public java.lang.CharSequence getINSRTTS() {
      return INSRT_TS;
    }

    /**
      * Sets the value of the 'INSRT_TS' field.
      * @param value The value of 'INSRT_TS'.
      * @return This builder.
      */
    public com.kafka.avro.score.Builder setINSRTTS(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this.INSRT_TS = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'INSRT_TS' field has been set.
      * @return True if the 'INSRT_TS' field has been set, false otherwise.
      */
    public boolean hasINSRTTS() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'INSRT_TS' field.
      * @return This builder.
      */
    public com.kafka.avro.score.Builder clearINSRTTS() {
      INSRT_TS = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'CHNG_TS' field.
      * @return The value.
      */
    public java.lang.CharSequence getCHNGTS() {
      return CHNG_TS;
    }

    /**
      * Sets the value of the 'CHNG_TS' field.
      * @param value The value of 'CHNG_TS'.
      * @return This builder.
      */
    public com.kafka.avro.score.Builder setCHNGTS(java.lang.CharSequence value) {
      validate(fields()[7], value);
      this.CHNG_TS = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'CHNG_TS' field has been set.
      * @return True if the 'CHNG_TS' field has been set, false otherwise.
      */
    public boolean hasCHNGTS() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'CHNG_TS' field.
      * @return This builder.
      */
    public com.kafka.avro.score.Builder clearCHNGTS() {
      CHNG_TS = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'INSRT_USR_ID' field.
      * @return The value.
      */
    public java.lang.CharSequence getINSRTUSRID() {
      return INSRT_USR_ID;
    }

    /**
      * Sets the value of the 'INSRT_USR_ID' field.
      * @param value The value of 'INSRT_USR_ID'.
      * @return This builder.
      */
    public com.kafka.avro.score.Builder setINSRTUSRID(java.lang.CharSequence value) {
      validate(fields()[8], value);
      this.INSRT_USR_ID = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'INSRT_USR_ID' field has been set.
      * @return True if the 'INSRT_USR_ID' field has been set, false otherwise.
      */
    public boolean hasINSRTUSRID() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'INSRT_USR_ID' field.
      * @return This builder.
      */
    public com.kafka.avro.score.Builder clearINSRTUSRID() {
      INSRT_USR_ID = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /**
      * Gets the value of the 'CHNG_USR_ID' field.
      * @return The value.
      */
    public java.lang.CharSequence getCHNGUSRID() {
      return CHNG_USR_ID;
    }

    /**
      * Sets the value of the 'CHNG_USR_ID' field.
      * @param value The value of 'CHNG_USR_ID'.
      * @return This builder.
      */
    public com.kafka.avro.score.Builder setCHNGUSRID(java.lang.CharSequence value) {
      validate(fields()[9], value);
      this.CHNG_USR_ID = value;
      fieldSetFlags()[9] = true;
      return this;
    }

    /**
      * Checks whether the 'CHNG_USR_ID' field has been set.
      * @return True if the 'CHNG_USR_ID' field has been set, false otherwise.
      */
    public boolean hasCHNGUSRID() {
      return fieldSetFlags()[9];
    }


    /**
      * Clears the value of the 'CHNG_USR_ID' field.
      * @return This builder.
      */
    public com.kafka.avro.score.Builder clearCHNGUSRID() {
      CHNG_USR_ID = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    /**
      * Gets the value of the 'ACTIVE_FLAG' field.
      * @return The value.
      */
    public java.lang.Integer getACTIVEFLAG() {
      return ACTIVE_FLAG;
    }

    /**
      * Sets the value of the 'ACTIVE_FLAG' field.
      * @param value The value of 'ACTIVE_FLAG'.
      * @return This builder.
      */
    public com.kafka.avro.score.Builder setACTIVEFLAG(int value) {
      validate(fields()[10], value);
      this.ACTIVE_FLAG = value;
      fieldSetFlags()[10] = true;
      return this;
    }

    /**
      * Checks whether the 'ACTIVE_FLAG' field has been set.
      * @return True if the 'ACTIVE_FLAG' field has been set, false otherwise.
      */
    public boolean hasACTIVEFLAG() {
      return fieldSetFlags()[10];
    }


    /**
      * Clears the value of the 'ACTIVE_FLAG' field.
      * @return This builder.
      */
    public com.kafka.avro.score.Builder clearACTIVEFLAG() {
      fieldSetFlags()[10] = false;
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
    public com.kafka.avro.score.Builder setREFERENCEID(java.lang.CharSequence value) {
      validate(fields()[11], value);
      this.REFERENCE_ID = value;
      fieldSetFlags()[11] = true;
      return this;
    }

    /**
      * Checks whether the 'REFERENCE_ID' field has been set.
      * @return True if the 'REFERENCE_ID' field has been set, false otherwise.
      */
    public boolean hasREFERENCEID() {
      return fieldSetFlags()[11];
    }


    /**
      * Clears the value of the 'REFERENCE_ID' field.
      * @return This builder.
      */
    public com.kafka.avro.score.Builder clearREFERENCEID() {
      REFERENCE_ID = null;
      fieldSetFlags()[11] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public score build() {
      try {
        score record = new score();
        record.SCORE_ID = fieldSetFlags()[0] ? this.SCORE_ID : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.DECISION_ID = fieldSetFlags()[1] ? this.DECISION_ID : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.LEGAL_ENTITY_ID = fieldSetFlags()[2] ? this.LEGAL_ENTITY_ID : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.DATA_PROVIDER_REPORT_ID = fieldSetFlags()[3] ? this.DATA_PROVIDER_REPORT_ID : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.SCORE_TYPE_CODE = fieldSetFlags()[4] ? this.SCORE_TYPE_CODE : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.VALUE = fieldSetFlags()[5] ? this.VALUE : (java.lang.CharSequence) defaultValue(fields()[5]);
        record.INSRT_TS = fieldSetFlags()[6] ? this.INSRT_TS : (java.lang.CharSequence) defaultValue(fields()[6]);
        record.CHNG_TS = fieldSetFlags()[7] ? this.CHNG_TS : (java.lang.CharSequence) defaultValue(fields()[7]);
        record.INSRT_USR_ID = fieldSetFlags()[8] ? this.INSRT_USR_ID : (java.lang.CharSequence) defaultValue(fields()[8]);
        record.CHNG_USR_ID = fieldSetFlags()[9] ? this.CHNG_USR_ID : (java.lang.CharSequence) defaultValue(fields()[9]);
        record.ACTIVE_FLAG = fieldSetFlags()[10] ? this.ACTIVE_FLAG : (java.lang.Integer) defaultValue(fields()[10]);
        record.REFERENCE_ID = fieldSetFlags()[11] ? this.REFERENCE_ID : (java.lang.CharSequence) defaultValue(fields()[11]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<score>
    WRITER$ = (org.apache.avro.io.DatumWriter<score>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<score>
    READER$ = (org.apache.avro.io.DatumReader<score>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
