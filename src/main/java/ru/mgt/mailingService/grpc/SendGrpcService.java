//package ru.mgt.mailingService.grpc;
//
//import io.grpc.ManagedChannel;
//import io.grpc.ManagedChannelBuilder;
//import lombok.RequiredArgsConstructor;
//import org.lognet.springboot.grpc.GRpcService;
//import ru.mgt.icp.notificationmanagement.contract.proto.SendingNotificationRequest;
//import ru.mgt.icp.notificationmanagment.contract.proto.SendRequest;
//import ru.mgt.icp.notificationmanagment.contract.proto.SendServiceGrpc;
//import ru.mgt.mailingService.service.MailingService;
//
//@GRpcService
//@RequiredArgsConstructor
//public class SendGrpcService {
//
//    final MailingService mailingService;
//
//    ManagedChannel channel = ManagedChannelBuilder.forTarget("localhost:8800")
//            .usePlaintext().build();
//    SendServiceGrpc.SendServiceBlockingStub request = SendingNotificationRequest
//            .newBuilder()
//            .setTemplate(SendingNotificationRequest.Template
//                    .newBuilder()
//                    .setEmail(SendingNotificationRequest.Template.EmailTemplate
//                            .newBuilder()
//                            .setSubject()
//                            .build())
//                    .build())
//
//            .build()
//}
