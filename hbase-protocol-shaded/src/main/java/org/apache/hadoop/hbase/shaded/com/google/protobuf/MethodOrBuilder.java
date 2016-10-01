// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/protobuf/api.proto

package org.apache.hadoop.hbase.shaded.com.google.protobuf;

public interface MethodOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.protobuf.Method)
    org.apache.hadoop.hbase.shaded.com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The simple name of this method.
   * </pre>
   *
   * <code>optional string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * The simple name of this method.
   * </pre>
   *
   * <code>optional string name = 1;</code>
   */
  org.apache.hadoop.hbase.shaded.com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * A URL of the input message type.
   * </pre>
   *
   * <code>optional string request_type_url = 2;</code>
   */
  java.lang.String getRequestTypeUrl();
  /**
   * <pre>
   * A URL of the input message type.
   * </pre>
   *
   * <code>optional string request_type_url = 2;</code>
   */
  org.apache.hadoop.hbase.shaded.com.google.protobuf.ByteString
      getRequestTypeUrlBytes();

  /**
   * <pre>
   * If true, the request is streamed.
   * </pre>
   *
   * <code>optional bool request_streaming = 3;</code>
   */
  boolean getRequestStreaming();

  /**
   * <pre>
   * The URL of the output message type.
   * </pre>
   *
   * <code>optional string response_type_url = 4;</code>
   */
  java.lang.String getResponseTypeUrl();
  /**
   * <pre>
   * The URL of the output message type.
   * </pre>
   *
   * <code>optional string response_type_url = 4;</code>
   */
  org.apache.hadoop.hbase.shaded.com.google.protobuf.ByteString
      getResponseTypeUrlBytes();

  /**
   * <pre>
   * If true, the response is streamed.
   * </pre>
   *
   * <code>optional bool response_streaming = 5;</code>
   */
  boolean getResponseStreaming();

  /**
   * <pre>
   * Any metadata attached to the method.
   * </pre>
   *
   * <code>repeated .google.protobuf.Option options = 6;</code>
   */
  java.util.List<org.apache.hadoop.hbase.shaded.com.google.protobuf.Option> 
      getOptionsList();
  /**
   * <pre>
   * Any metadata attached to the method.
   * </pre>
   *
   * <code>repeated .google.protobuf.Option options = 6;</code>
   */
  org.apache.hadoop.hbase.shaded.com.google.protobuf.Option getOptions(int index);
  /**
   * <pre>
   * Any metadata attached to the method.
   * </pre>
   *
   * <code>repeated .google.protobuf.Option options = 6;</code>
   */
  int getOptionsCount();
  /**
   * <pre>
   * Any metadata attached to the method.
   * </pre>
   *
   * <code>repeated .google.protobuf.Option options = 6;</code>
   */
  java.util.List<? extends org.apache.hadoop.hbase.shaded.com.google.protobuf.OptionOrBuilder> 
      getOptionsOrBuilderList();
  /**
   * <pre>
   * Any metadata attached to the method.
   * </pre>
   *
   * <code>repeated .google.protobuf.Option options = 6;</code>
   */
  org.apache.hadoop.hbase.shaded.com.google.protobuf.OptionOrBuilder getOptionsOrBuilder(
      int index);

  /**
   * <pre>
   * The source syntax of this method.
   * </pre>
   *
   * <code>optional .google.protobuf.Syntax syntax = 7;</code>
   */
  int getSyntaxValue();
  /**
   * <pre>
   * The source syntax of this method.
   * </pre>
   *
   * <code>optional .google.protobuf.Syntax syntax = 7;</code>
   */
  org.apache.hadoop.hbase.shaded.com.google.protobuf.Syntax getSyntax();
}
