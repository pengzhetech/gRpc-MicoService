// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: helloworld.proto

package com.javaman.grpc.dto.hello;

public final class HelloWorldProtoHello {
    private HelloWorldProtoHello() {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistryLite registry) {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions(
                (com.google.protobuf.ExtensionRegistryLite) registry);
    }

    static final com.google.protobuf.Descriptors.Descriptor
            internal_static_helloworld_HelloRequest_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_helloworld_HelloRequest_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
            internal_static_helloworld_HelloReply_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_helloworld_HelloReply_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor
    getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor
            descriptor;

    static {
        String[] descriptorData = {
                "\n\020helloworld.proto\022\nhelloworld\"\034\n\014HelloR" +
                        "equest\022\014\n\004name\030\001 \001(\t\"\035\n\nHelloReply\022\017\n\007me" +
                        "ssage\030\001 \001(\t2\216\001\n\007Greeter\022>\n\010SayHello\022\030.he" +
                        "lloworld.HelloRequest\032\026.helloworld.Hello" +
                        "Reply\"\000\022C\n\rSayHelloAgain\022\030.helloworld.He" +
                        "lloRequest\032\026.helloworld.HelloReply\"\000B8\n\030" +
                        "com.javaman.grpc.exampleB\024HelloWorldProt" +
                        "oHelloP\001\242\002\003HLWb\006proto3"
        };
        com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
                new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
                    public com.google.protobuf.ExtensionRegistry assignDescriptors(
                            com.google.protobuf.Descriptors.FileDescriptor root) {
                        descriptor = root;
                        return null;
                    }
                };
        com.google.protobuf.Descriptors.FileDescriptor
                .internalBuildGeneratedFileFrom(descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[]{
                        }, assigner);
        internal_static_helloworld_HelloRequest_descriptor =
                getDescriptor().getMessageTypes().get(0);
        internal_static_helloworld_HelloRequest_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_helloworld_HelloRequest_descriptor,
                new String[]{"Name",});
        internal_static_helloworld_HelloReply_descriptor =
                getDescriptor().getMessageTypes().get(1);
        internal_static_helloworld_HelloReply_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_helloworld_HelloReply_descriptor,
                new String[]{"Message",});
    }

    // @@protoc_insertion_point(outer_class_scope)
}
