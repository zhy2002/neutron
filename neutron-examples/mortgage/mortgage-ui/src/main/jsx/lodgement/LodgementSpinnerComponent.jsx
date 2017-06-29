import React from 'react';

export default function LodgementSpinnerComponent() {
    return (
        <div className="loading-spinner-component hide">
            <div className="floatingBarsG">
                <i className="fa fa-circle-o-notch fa-spin fa-3x fa-fw"/>
                <span className="sr-only">Loading...</span>
            </div>
        </div>
    );
}
