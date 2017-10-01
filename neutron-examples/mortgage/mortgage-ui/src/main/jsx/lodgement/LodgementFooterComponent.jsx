import React from 'react';
import ResizeAware from 'react-resize-aware';
import LodgementService from './services/LodgementService';


export default class LodgementFooterComponent extends React.PureComponent {

    constructor(props) {
        super(props);

        this.handleResize = ({height}) => {
            LodgementService.updateFooterHeight(height);
        };
    }

    render() {
        return (<div className="lodgement-footer-component">
                <ResizeAware
                    style={{position: 'relative'}}
                    onlyEvent
                    onResize={this.handleResize}
                >
                    <div className="text-center">
                        Experimental project by zhy2002
                    </div>
                </ResizeAware>
            </div>
        );
    }
}
