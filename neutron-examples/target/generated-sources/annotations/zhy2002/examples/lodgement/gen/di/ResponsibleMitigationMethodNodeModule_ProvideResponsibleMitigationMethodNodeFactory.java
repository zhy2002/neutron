package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.ResponsibleMitigationMethodNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final
class ResponsibleMitigationMethodNodeModule_ProvideResponsibleMitigationMethodNodeFactory
    implements Factory<ResponsibleMitigationMethodNode> {
  private final ResponsibleMitigationMethodNodeModule module;

  public ResponsibleMitigationMethodNodeModule_ProvideResponsibleMitigationMethodNodeFactory(
      ResponsibleMitigationMethodNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ResponsibleMitigationMethodNode get() {
    return Preconditions.checkNotNull(
        module.provideResponsibleMitigationMethodNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ResponsibleMitigationMethodNode> create(
      ResponsibleMitigationMethodNodeModule module) {
    return new ResponsibleMitigationMethodNodeModule_ProvideResponsibleMitigationMethodNodeFactory(
        module);
  }

  /**
   * Proxies {@link ResponsibleMitigationMethodNodeModule#provideResponsibleMitigationMethodNode()}.
   */
  public static ResponsibleMitigationMethodNode proxyProvideResponsibleMitigationMethodNode(
      ResponsibleMitigationMethodNodeModule instance) {
    return instance.provideResponsibleMitigationMethodNode();
  }
}
