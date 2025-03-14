<?php
$fichero = "resultados.txt"; // Use same file for read/write

// Read existing votes
$contenido = file_get_contents($fichero);
$array = explode("||", $contenido);

// Initialize counts from file
$real = (int)$array[0];
$bar = (int)$array[1];
$atl = (int)$array[2];
$sev = (int)$array[3];
$cov = (int)$array[4];


// Process new vote
$voto = $_GET['voto'];

if ($voto == 0) $real++;
if ($voto == 1) $bar++;
if ($voto == 2) $atl++;
if ($voto == 3) $sev++;
if ($voto == 4) $cov++;

// Save updated votes
$insertvoto = implode("||", [$real, $bar, $atl, $sev, $cov]);
file_put_contents($fichero, $insertvoto);

// Calculate percentages
$total = $real + $bar + $atl + $sev;
$tantoMadrid = $total ? round(($real/$total)*100, 2) : 0;
$tantoBarcelona = $total ? round(($bar/$total)*100, 2) : 0;
$tantoAtletico = $total ? round(($atl/$total)*100, 2) : 0;
$tantoSevilla = $total ? round(($sev/$total)*100, 2) : 0;
$tantoCovadonga = $total ? round(($cov/$total)*100, 2) : 0;

?>

<h2>Resultado:</h2>
<table>
    <tr>
        <td>Real Madrid:</td>
        <td>
            <img src="barrita.gif" width="<?php echo $tantoMadrid; ?>" height="20"> <?php echo $tantoMadrid; ?>%
        </td>
    </tr>
    <tr>
        <td>Barcelona:</td>
        <td>
            <img src="barrita.gif" width="<?php echo $tantoBarcelona; ?>" height="20"> <?php echo $tantoBarcelona; ?>%
        </td>
    </tr>
    <tr>
        <td>Atlético de Madrid:</td>
        <td>
            <img src="barrita.gif" width="<?php echo $tantoAtletico; ?>" height="20"> <?php echo $tantoAtletico; ?>%
        </td>
    </tr>
    <tr>
        <td>Sevilla:</td>
        <td>
            <img src="barrita.gif" width="<?php echo $tantoSevilla; ?>" height="20"> <?php echo $tantoSevilla; ?>%
        </td>
    </tr>
    <tr>
        <td>Covadonga:</td>
        <td>
            <img src="barrita.gif" width="<?php echo $tantoCovadonga; ?>" height="20"> <?php echo $tantoCovadonga; ?>%
        </td>
    </tr>
</table>
