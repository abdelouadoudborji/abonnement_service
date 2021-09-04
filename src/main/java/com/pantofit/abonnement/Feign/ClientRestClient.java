package com.pantofit.abonnement.Feign;



import org.springframework.cloud.openfeign.FeignClient;


@FeignClient(name = "CLIENT-SERVICE")//client-service
public interface ClientRestClient {
}
