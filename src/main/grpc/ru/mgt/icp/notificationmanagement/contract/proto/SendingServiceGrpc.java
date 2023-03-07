package ru.mgt.icp.notificationmanagement.contract.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.52.1)",
    comments = "Source: proto/SendService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SendingServiceGrpc {

  private SendingServiceGrpc() {}

  public static final String SERVICE_NAME = "SendingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ru.mgt.icp.notificationmanagement.contract.proto.SendingNotificationRequest,
      ru.mgt.icp.notificationmanagement.contract.proto.SendingNotificationResponse> getSendMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "send",
      requestType = ru.mgt.icp.notificationmanagement.contract.proto.SendingNotificationRequest.class,
      responseType = ru.mgt.icp.notificationmanagement.contract.proto.SendingNotificationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ru.mgt.icp.notificationmanagement.contract.proto.SendingNotificationRequest,
      ru.mgt.icp.notificationmanagement.contract.proto.SendingNotificationResponse> getSendMethod() {
    io.grpc.MethodDescriptor<ru.mgt.icp.notificationmanagement.contract.proto.SendingNotificationRequest, ru.mgt.icp.notificationmanagement.contract.proto.SendingNotificationResponse> getSendMethod;
    if ((getSendMethod = SendingServiceGrpc.getSendMethod) == null) {
      synchronized (SendingServiceGrpc.class) {
        if ((getSendMethod = SendingServiceGrpc.getSendMethod) == null) {
          SendingServiceGrpc.getSendMethod = getSendMethod =
              io.grpc.MethodDescriptor.<ru.mgt.icp.notificationmanagement.contract.proto.SendingNotificationRequest, ru.mgt.icp.notificationmanagement.contract.proto.SendingNotificationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "send"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.mgt.icp.notificationmanagement.contract.proto.SendingNotificationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.mgt.icp.notificationmanagement.contract.proto.SendingNotificationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SendingServiceMethodDescriptorSupplier("send"))
              .build();
        }
      }
    }
    return getSendMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SendingServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SendingServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SendingServiceStub>() {
        @java.lang.Override
        public SendingServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SendingServiceStub(channel, callOptions);
        }
      };
    return SendingServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SendingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SendingServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SendingServiceBlockingStub>() {
        @java.lang.Override
        public SendingServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SendingServiceBlockingStub(channel, callOptions);
        }
      };
    return SendingServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SendingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SendingServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SendingServiceFutureStub>() {
        @java.lang.Override
        public SendingServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SendingServiceFutureStub(channel, callOptions);
        }
      };
    return SendingServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SendingServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void send(ru.mgt.icp.notificationmanagement.contract.proto.SendingNotificationRequest request,
        io.grpc.stub.StreamObserver<ru.mgt.icp.notificationmanagement.contract.proto.SendingNotificationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ru.mgt.icp.notificationmanagement.contract.proto.SendingNotificationRequest,
                ru.mgt.icp.notificationmanagement.contract.proto.SendingNotificationResponse>(
                  this, METHODID_SEND)))
          .build();
    }
  }

  /**
   */
  public static final class SendingServiceStub extends io.grpc.stub.AbstractAsyncStub<SendingServiceStub> {
    private SendingServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SendingServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SendingServiceStub(channel, callOptions);
    }

    /**
     */
    public void send(ru.mgt.icp.notificationmanagement.contract.proto.SendingNotificationRequest request,
        io.grpc.stub.StreamObserver<ru.mgt.icp.notificationmanagement.contract.proto.SendingNotificationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SendingServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<SendingServiceBlockingStub> {
    private SendingServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SendingServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SendingServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ru.mgt.icp.notificationmanagement.contract.proto.SendingNotificationResponse send(ru.mgt.icp.notificationmanagement.contract.proto.SendingNotificationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SendingServiceFutureStub extends io.grpc.stub.AbstractFutureStub<SendingServiceFutureStub> {
    private SendingServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SendingServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SendingServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ru.mgt.icp.notificationmanagement.contract.proto.SendingNotificationResponse> send(
        ru.mgt.icp.notificationmanagement.contract.proto.SendingNotificationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SendingServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SendingServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND:
          serviceImpl.send((ru.mgt.icp.notificationmanagement.contract.proto.SendingNotificationRequest) request,
              (io.grpc.stub.StreamObserver<ru.mgt.icp.notificationmanagement.contract.proto.SendingNotificationResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SendingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SendingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ru.mgt.icp.notificationmanagement.contract.proto.SendingServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SendingService");
    }
  }

  private static final class SendingServiceFileDescriptorSupplier
      extends SendingServiceBaseDescriptorSupplier {
    SendingServiceFileDescriptorSupplier() {}
  }

  private static final class SendingServiceMethodDescriptorSupplier
      extends SendingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SendingServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SendingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SendingServiceFileDescriptorSupplier())
              .addMethod(getSendMethod())
              .build();
        }
      }
    }
    return result;
  }
}
