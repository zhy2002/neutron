package zhy2002.examples.app.gen.node;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.app.gen.LodgementNodeContext;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LodgementNode_Factory implements Factory<LodgementNode> {
  private final MembersInjector<LodgementNode> lodgementNodeMembersInjector;

  private final Provider<LodgementNodeContext> contextProvider;

  public LodgementNode_Factory(
      MembersInjector<LodgementNode> lodgementNodeMembersInjector,
      Provider<LodgementNodeContext> contextProvider) {
    assert lodgementNodeMembersInjector != null;
    this.lodgementNodeMembersInjector = lodgementNodeMembersInjector;
    assert contextProvider != null;
    this.contextProvider = contextProvider;
  }

  @Override
  public LodgementNode get() {
    return MembersInjectors.injectMembers(
        lodgementNodeMembersInjector, new LodgementNode(contextProvider.get()));
  }

  public static Factory<LodgementNode> create(
      MembersInjector<LodgementNode> lodgementNodeMembersInjector,
      Provider<LodgementNodeContext> contextProvider) {
    return new LodgementNode_Factory(lodgementNodeMembersInjector, contextProvider);
  }
}
