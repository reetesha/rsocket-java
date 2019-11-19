package io.rsocket;

import org.openjdk.jmh.infra.Blackhole;

public class PayloadsPerfSubscriber extends PerfSubscriber<Payload> {

  public PayloadsPerfSubscriber(Blackhole blackhole) {
    super(blackhole);
  }

  @Override
  public void onNext(Payload payload) {
    payload.release();
    super.onNext(payload);
  }
}
