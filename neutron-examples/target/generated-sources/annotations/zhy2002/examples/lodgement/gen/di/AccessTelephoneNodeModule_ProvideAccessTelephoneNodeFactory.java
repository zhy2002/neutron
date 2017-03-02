package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.AccessTelephoneNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AccessTelephoneNodeModule_ProvideAccessTelephoneNodeFactory
    implements Factory<AccessTelephoneNode> {
  private final AccessTelephoneNodeModule module;

  public AccessTelephoneNodeModule_ProvideAccessTelephoneNodeFactory(
      AccessTelephoneNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public AccessTelephoneNode get() {
    return Preconditions.checkNotNull(
        module.provideAccessTelephoneNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<AccessTelephoneNode> create(AccessTelephoneNodeModule module) {
    return new AccessTelephoneNodeModule_ProvideAccessTelephoneNodeFactory(module);
  }

  /** Proxies {@link AccessTelephoneNodeModule#provideAccessTelephoneNode()}. */
  public static AccessTelephoneNode proxyProvideAccessTelephoneNode(
      AccessTelephoneNodeModule instance) {
    return instance.provideAccessTelephoneNode();
  }
}
