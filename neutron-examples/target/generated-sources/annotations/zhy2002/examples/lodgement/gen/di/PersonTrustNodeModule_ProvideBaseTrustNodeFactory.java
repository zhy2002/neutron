package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.BaseTrustNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PersonTrustNodeModule_ProvideBaseTrustNodeFactory
    implements Factory<BaseTrustNode<?>> {
  private final PersonTrustNodeModule module;

  public PersonTrustNodeModule_ProvideBaseTrustNodeFactory(PersonTrustNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public BaseTrustNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideBaseTrustNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<BaseTrustNode<?>> create(PersonTrustNodeModule module) {
    return new PersonTrustNodeModule_ProvideBaseTrustNodeFactory(module);
  }

  /** Proxies {@link PersonTrustNodeModule#provideBaseTrustNode()}. */
  public static BaseTrustNode<?> proxyProvideBaseTrustNode(PersonTrustNodeModule instance) {
    return instance.provideBaseTrustNode();
  }
}
