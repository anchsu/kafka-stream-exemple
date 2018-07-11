/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.zenika.avro.product;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Product extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Product\",\"namespace\":\"com.zenika.avro.product\",\"fields\":[{\"name\":\"label\",\"type\":\"string\",\"doc\":\"The label\"},{\"name\":\"vat\",\"type\":\"string\",\"doc\":\"The value added taxes\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** The label */
  @Deprecated public java.lang.CharSequence label;
  /** The value added taxes */
  @Deprecated public java.lang.CharSequence vat;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public Product() {}

  /**
   * All-args constructor.
   */
  public Product(java.lang.CharSequence label, java.lang.CharSequence vat) {
    this.label = label;
    this.vat = vat;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return label;
    case 1: return vat;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: label = (java.lang.CharSequence)value$; break;
    case 1: vat = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'label' field.
   * The label   */
  public java.lang.CharSequence getLabel() {
    return label;
  }

  /**
   * Sets the value of the 'label' field.
   * The label   * @param value the value to set.
   */
  public void setLabel(java.lang.CharSequence value) {
    this.label = value;
  }

  /**
   * Gets the value of the 'vat' field.
   * The value added taxes   */
  public java.lang.CharSequence getVat() {
    return vat;
  }

  /**
   * Sets the value of the 'vat' field.
   * The value added taxes   * @param value the value to set.
   */
  public void setVat(java.lang.CharSequence value) {
    this.vat = value;
  }

  /** Creates a new Product RecordBuilder */
  public static com.zenika.avro.product.Product.Builder newBuilder() {
    return new com.zenika.avro.product.Product.Builder();
  }
  
  /** Creates a new Product RecordBuilder by copying an existing Builder */
  public static com.zenika.avro.product.Product.Builder newBuilder(com.zenika.avro.product.Product.Builder other) {
    return new com.zenika.avro.product.Product.Builder(other);
  }
  
  /** Creates a new Product RecordBuilder by copying an existing Product instance */
  public static com.zenika.avro.product.Product.Builder newBuilder(com.zenika.avro.product.Product other) {
    return new com.zenika.avro.product.Product.Builder(other);
  }
  
  /**
   * RecordBuilder for Product instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Product>
    implements org.apache.avro.data.RecordBuilder<Product> {

    private java.lang.CharSequence label;
    private java.lang.CharSequence vat;

    /** Creates a new Builder */
    private Builder() {
      super(com.zenika.avro.product.Product.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.zenika.avro.product.Product.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.label)) {
        this.label = data().deepCopy(fields()[0].schema(), other.label);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.vat)) {
        this.vat = data().deepCopy(fields()[1].schema(), other.vat);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing Product instance */
    private Builder(com.zenika.avro.product.Product other) {
            super(com.zenika.avro.product.Product.SCHEMA$);
      if (isValidValue(fields()[0], other.label)) {
        this.label = data().deepCopy(fields()[0].schema(), other.label);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.vat)) {
        this.vat = data().deepCopy(fields()[1].schema(), other.vat);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'label' field */
    public java.lang.CharSequence getLabel() {
      return label;
    }
    
    /** Sets the value of the 'label' field */
    public com.zenika.avro.product.Product.Builder setLabel(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.label = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'label' field has been set */
    public boolean hasLabel() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'label' field */
    public com.zenika.avro.product.Product.Builder clearLabel() {
      label = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'vat' field */
    public java.lang.CharSequence getVat() {
      return vat;
    }
    
    /** Sets the value of the 'vat' field */
    public com.zenika.avro.product.Product.Builder setVat(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.vat = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'vat' field has been set */
    public boolean hasVat() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'vat' field */
    public com.zenika.avro.product.Product.Builder clearVat() {
      vat = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public Product build() {
      try {
        Product record = new Product();
        record.label = fieldSetFlags()[0] ? this.label : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.vat = fieldSetFlags()[1] ? this.vat : (java.lang.CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}