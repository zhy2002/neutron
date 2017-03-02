package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.PropertySubTypeNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PropertySubTypeNode_MembersInjector
    implements MembersInjector<PropertySubTypeNode> {
  private final Provider<PropertySubTypeNodeComponent.Builder> builderProvider;

  public PropertySubTypeNode_MembersInjector(
      Provider<PropertySubTypeNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<PropertySubTypeNode> create(
      Provider<PropertySubTypeNodeComponent.Builder> builderProvider) {
    return new PropertySubTypeNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(PropertySubTypeNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      PropertySubTypeNode instance,
      Provider<PropertySubTypeNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
