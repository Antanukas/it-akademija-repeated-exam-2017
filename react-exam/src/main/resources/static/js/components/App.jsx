var Link = ReactRouter.Link;
var IndexLink = ReactRouter.IndexLink;

var App = React.createClass({
    render: function () {
        return (
            <div style={{paddingTop: '20px'}}>
                {this.props.children}
            </div>
        );
    }
});

window.App = App;