package fluxAndMono;

import org.junit.jupiter.api.Test;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

public class FluxAndMono {
	
	@Test
	public void flux()
	{
		Flux<String>string = Flux.just("spring","web","flux")
		.log();
		
	
		string
		.subscribe(System.out::println);
	}
	
	
	@Test
	public void fluxTest()
	{
		Flux<String>string = Flux.just("spring","web","flux")
				.log();
		
		 StepVerifier.create(string)
		   .expectNext("spring")
		   .expectNext("web")
		   .expectNext("flux")
		   .verifyComplete();
	}
	
	
	
	
	@Test
	public void mono()
	{
		Mono<Integer> integer = Mono.just(1);
		
		integer
		.subscribe(System.out::println);
	}
	
	
	@Test
	public void monoTest()
	{
		Mono<Integer> integer = Mono.just(1)
				.log();
		
		 StepVerifier.create(integer)
		   .expectNext(1)
		   .verifyComplete();

	}

}
