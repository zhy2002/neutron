package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.PropertyPurseNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PropertyPurseNode_MembersInjector implements MembersInjector<PropertyPurseNode> {
  private final Provider<PropertyPurseNodeComponent.Builder> builderProvider;

  public PropertyPurseNode_MembersInjector(
      Provider<PropertyPurseNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<PropertyPurseNode> create(
      Provider<PropertyPurseNodeComponent.Builder> builderProvider) {
    return new PropertyPurseNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(PropertyPurseNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      PropertyPurseNode instance, Provider<PropertyPurseNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
