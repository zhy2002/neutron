package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.ApplicationTypeNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApplicationTypeNodeModule_ProvideApplicationTypeNodeFactory
    implements Factory<ApplicationTypeNode> {
  private final ApplicationTypeNodeModule module;

  public ApplicationTypeNodeModule_ProvideApplicationTypeNodeFactory(
      ApplicationTypeNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ApplicationTypeNode get() {
    return Preconditions.checkNotNull(
        module.provideApplicationTypeNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ApplicationTypeNode> create(ApplicationTypeNodeModule module) {
    return new ApplicationTypeNodeModule_ProvideApplicationTypeNodeFactory(module);
  }

  /** Proxies {@link ApplicationTypeNodeModule#provideApplicationTypeNode()}. */
  public static ApplicationTypeNode proxyProvideApplicationTypeNode(
      ApplicationTypeNodeModule instance) {
    return instance.provideApplicationTypeNode();
  }
}
