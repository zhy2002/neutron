package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.PropertyPurseNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PropertyPurseNodeModule_ProvidePropertyPurseNodeFactory
    implements Factory<PropertyPurseNode> {
  private final PropertyPurseNodeModule module;

  public PropertyPurseNodeModule_ProvidePropertyPurseNodeFactory(PropertyPurseNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public PropertyPurseNode get() {
    return Preconditions.checkNotNull(
        module.providePropertyPurseNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<PropertyPurseNode> create(PropertyPurseNodeModule module) {
    return new PropertyPurseNodeModule_ProvidePropertyPurseNodeFactory(module);
  }

  /** Proxies {@link PropertyPurseNodeModule#providePropertyPurseNode()}. */
  public static PropertyPurseNode proxyProvidePropertyPurseNode(PropertyPurseNodeModule instance) {
    return instance.providePropertyPurseNode();
  }
}
