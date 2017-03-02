package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.OtherIncomePreviousYearNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherIncomePreviousYearNode_MembersInjector
    implements MembersInjector<OtherIncomePreviousYearNode> {
  private final Provider<OtherIncomePreviousYearNodeComponent.Builder> builderProvider;

  public OtherIncomePreviousYearNode_MembersInjector(
      Provider<OtherIncomePreviousYearNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<OtherIncomePreviousYearNode> create(
      Provider<OtherIncomePreviousYearNodeComponent.Builder> builderProvider) {
    return new OtherIncomePreviousYearNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(OtherIncomePreviousYearNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      OtherIncomePreviousYearNode instance,
      Provider<OtherIncomePreviousYearNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
