package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.BusinessTypeNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BusinessTypeNodeModule_ProvideBusinessTypeNodeFactory
    implements Factory<BusinessTypeNode> {
  private final BusinessTypeNodeModule module;

  public BusinessTypeNodeModule_ProvideBusinessTypeNodeFactory(BusinessTypeNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public BusinessTypeNode get() {
    return Preconditions.checkNotNull(
        module.provideBusinessTypeNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<BusinessTypeNode> create(BusinessTypeNodeModule module) {
    return new BusinessTypeNodeModule_ProvideBusinessTypeNodeFactory(module);
  }

  /** Proxies {@link BusinessTypeNodeModule#provideBusinessTypeNode()}. */
  public static BusinessTypeNode proxyProvideBusinessTypeNode(BusinessTypeNodeModule instance) {
    return instance.provideBusinessTypeNode();
  }
}
