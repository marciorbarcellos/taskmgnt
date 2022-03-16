import Pagination from "components/pagination";
import { Link } from "react-router-dom";

function Listing() {

    return (
        <>
            <Pagination />

            <div className="row">
                <div className="col-sm-6 col-lg-4 col-xl-3 mb=3">
                    <p>Primeiro da Lista</p>
                    <Link to={'/form/{movie.id}'}>
                        <div className="btn btn-primary dsmovie-btn">Avaliar</div>
                    </Link>
                </div>
                <div className="col-sm-6 col-lg-4 col-xl-3 mb=3">
                    <p>Segundo da Lista</p>
                    <Link to={'/form/{movie.id}'}>
                        <div className="btn btn-primary dsmovie-btn">Avaliar</div>
                    </Link>
                </div>
                <div className="col-sm-6 col-lg-4 col-xl-3 mb=3">
                    <p>Terceiro da Lista</p>
                    <Link to={'/form/{movie.id}'}>
                        <div className="btn btn-primary dsmovie-btn">Avaliar</div>
                    </Link>
                </div>
                <div className="col-sm-6 col-lg-4 col-xl-3 mb=3">
                    <p>Quarto da Lista</p>
                    <Link to={'/form/{movie.id}'}>
                        <div className="btn btn-primary dsmovie-btn">Avaliar</div>
                    </Link>
                </div>
                <div className="col-sm-6 col-lg-4 col-xl-3 mb=3">
                    <p>Quinto da Lista</p>
                    <Link to={'/form/{movie.id}'}>
                        <div className="btn btn-primary dsmovie-btn">Avaliar</div>
                    </Link>
                </div>
                <div className="col-sm-6 col-lg-4 col-xl-3 mb=3">
                    <p>Sexto da Lista</p>
                    <Link to={'/form/{movie.id}'}>
                        <div className="btn btn-primary dsmovie-btn">Avaliar</div>
                    </Link>
                </div>
            </div>
        </>
    );
}

export default Listing;
